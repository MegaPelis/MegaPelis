package com.megapelis.api.http;

import android.os.AsyncTask;
import android.os.StrictMode;

import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.enums.APIStatusEnum;
import com.megapelis.api.model.http.HTTP;
import com.megapelis.api.util.APICommon;
import com.megapelis.api.util.APIConstant;
import com.megapelis.api.util.MegaPelisException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Clase {@link RequestHTTP}
 * @author sergio.barrios.
 */
public class RequestHTTP<T> {

    /**
     * Metodo que realiza una peticion post.
     * @param http
     * @return {@link Response}
     */
    public Response post(HTTP<T> http){
        http.build(Boolean.TRUE.booleanValue(), Boolean.TRUE.booleanValue(),
                APIConstant.STRING_API_HTTP_PROPERTY_CONTENT_TYPE_VALUE,
                APIConstant.STRING_API_HTTP_PROPERTY_ACCEPT_VALUE,
                APIConstant.STRING_API_HTTP_PROPERTY_METHOD_VALUE_POST);
        return execute(http);
    }

    /**
     * Metodo que permite realizar la petición al api.
     * @param httpRequest
     * @return {@link Response}
     */
    private Response execute(HTTP<T> httpRequest){
        Response response;
        HttpURLConnection httpURLConnection;
        String responseString;
        try {
            if(null != httpRequest.getHttpMock() &&
                    httpRequest.getHttpMock().isStatus()){
                String url = httpRequest.getHttpMock().url();
                InputStream inputStream = new DropboxHTTP(APIConstant.STRING_DROPBOX_TOKEN).read(url);
                responseString = read(inputStream);
            }else {
                if(APIConstant.STRING_API_HTTP_PROPERTY_METHOD_VALUE_GET.contains(httpRequest.getMethod())){
                    httpRequest.setContentType(null);
                    httpRequest.setRequest(null);
                    httpRequest.setUrl(httpRequest.getUrl());
                }
                httpURLConnection  = httpURLConnection(httpRequest);
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                responseString = response(httpRequest, httpURLConnection);
            }
            response = APICommon.convertObjectToClass(responseString, Response.class);
            if(null != response && null != response.getData())
                response.setData(APICommon.convertObjectToClass(response.getData(), httpRequest.getResponse()));
        } catch (IOException | MegaPelisException exception) {
            APICommon.output(exception);
            response = APICommon.buildResponse(httpRequest.getRequest());
        }
        return response;
    }

    /**
     * Metodo que permite construir la conexión con la url.
     * @param httpRequest
     * @return {@link HttpURLConnection}
     * @throws IOException
     */
    private HttpURLConnection httpURLConnection(HTTP<T> httpRequest) throws IOException {
        URL url = new URL(httpRequest.getUrl());
        HttpURLConnection httpURLConnection  = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(httpRequest.isOutput());
        httpURLConnection.setDoInput(httpRequest.isInput());
        if(null != httpRequest.getContentType())
            httpURLConnection.setRequestProperty(APIConstant.STRING_API_HTTP_PROPERTY_CONTENT_TYPE_NAME, httpRequest.getContentType());
        if(null != httpRequest.getAccept())
            httpURLConnection.setRequestProperty(APIConstant.STRING_API_HTTP_PROPERTY_ACCEPT_NAME, httpRequest.getAccept());
        if(null != httpRequest.getMethod())
            httpURLConnection.setRequestProperty(APIConstant.STRING_API_HTTP_PROPERTY_METHOD_NAME, httpRequest.getMethod());
        else {
            httpRequest.setMethod((httpRequest.getRequest() == null)
                    ? APIConstant.STRING_API_HTTP_PROPERTY_METHOD_VALUE_GET
                    : APIConstant.STRING_API_HTTP_PROPERTY_METHOD_VALUE_POST);
            return httpURLConnection(httpRequest);
        }
        APICommon.output(httpURLConnection);
        return httpURLConnection;
    }

    /**
     * Metodo que formatea la respuesta del api.
     * @param httpRequest
     * @param httpURLConnection
     * @return {@link String}
     * @throws IOException
     * @throws MegaPelisException
     */
    private String response(HTTP<T> httpRequest, HttpURLConnection httpURLConnection) throws IOException, MegaPelisException {
        if(null != httpRequest.getRequest() &&
                APIConstant.STRING_API_HTTP_PROPERTY_METHOD_VALUE_POST.equals(httpRequest.getMethod())){
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, APIConstant.STRING_CMM_UTF_8));
            String request = APICommon.getStringJSON(httpRequest.getRequest());
            writer.write(request);
            writer.close();
            outputStream.close();

        }
        // Se procesa respuesta
        int HttpResult = httpURLConnection.getResponseCode();
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            return read(httpURLConnection.getInputStream());
        } else {
            throw new MegaPelisException(APIStatusEnum.ERROR);
        }
    }

    /**
     * Metodo para leer un {@link InputStream}
     * @param inputStream
     * @return {@link String}
     * @throws IOException
     * @throws MegaPelisException
     */
    public static String read(InputStream inputStream) throws IOException, MegaPelisException{
        if(null == inputStream)
            throw new MegaPelisException(APIStatusEnum.ERROR);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, APIConstant.STRING_CMM_UTF_8));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        br.close();
        return sb.toString();
    }
}
