package com.megapelis.api.http;

import com.google.gson.Gson;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.http.HTTP;
import com.megapelis.util.APIConstant;
import com.megapelis.util.MegaPelisException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class RequestHTTP<T> {

    public Response execute(HTTP<T> httpRequest){
        Response response = null;
        HttpURLConnection httpURLConnection;
        String responseString;
        Gson gson;
        try {
            httpURLConnection  = httpURLConnection(httpRequest);
            responseString = response(httpRequest, httpURLConnection);
            gson = new Gson();
            response = gson.fromJson(responseString, Response.class);
        } catch (IOException | MegaPelisException e) {
            e.printStackTrace();
        }
        return response;
    }

    public Response post(HTTP<T> http){
        http.build(Boolean.TRUE.booleanValue(), Boolean.TRUE.booleanValue(),
                APIConstant.STRING_API_HTTP_PROPERTY_CONTENT_TYPE_VALUE, APIConstant.STRING_API_HTTP_PROPERTY_ACCEPT_VALUE,
                APIConstant.STRING_API_HTTP_PROPERTY_METHOD_VALUE_POST);
        return execute(http);
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
        httpURLConnection.setRequestProperty(APIConstant.STRING_API_HTTP_PROPERTY_CONTENT_TYPE_NAME, httpRequest.getContentType());
        httpURLConnection.setRequestProperty(APIConstant.STRING_API_HTTP_PROPERTY_ACCEPT_NAME, httpRequest.getAccept());
        httpURLConnection.setRequestProperty(APIConstant.STRING_API_HTTP_PROPERTY_METHOD_NAME, httpRequest.getMethod());
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private String buildRequest(Request request){
        Gson gson = new Gson();
        return gson.toJson(request);
    }

    private String response(HTTP<T> httpRequest, HttpURLConnection httpURLConnection) throws IOException, MegaPelisException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, APIConstant.STRING_CMM_UTF_8));
        String request = buildRequest(httpRequest.getRequest());
        writer.write(request);
        writer.close();
        outputStream.close();
        // Se procesa respuesta
        StringBuilder sb = new StringBuilder();
        int HttpResult = httpURLConnection.getResponseCode();
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), APIConstant.STRING_CMM_UTF_8));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            return sb.toString();
        } else {
            throw new MegaPelisException();
        }
    }
}
