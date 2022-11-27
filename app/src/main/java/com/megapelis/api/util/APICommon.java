package com.megapelis.api.util;

import android.os.Build;

import com.google.gson.Gson;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.request.generic.RequestProperty;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.dto.response.generic.ResponseStatus;
import com.megapelis.api.model.enums.APIStatusEnum;
import com.megapelis.api.model.factory.DataFactory;
import com.megapelis.api.model.http.HTTP;
import com.megapelis.api.model.http.HTTPMock;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class APICommon {

    private APICommon(){
    }

    /**
     * Metodo que permite validar una cadena no este vacia.
     * @param value
     * @return {@link boolean}
     */
    public static boolean isValidString(String value){
        return null != value && !value.trim().isEmpty();
    }

    /**
     * Metodo que permite validar varias cadenas.
     * @param values
     * @return {@link boolean}
     */
    public static boolean isValidString(String ... values) {
        for (String value : values) {
            if (!isValidString(value)) {
                return Boolean.FALSE.booleanValue();
            }
        }
        return Boolean.TRUE.booleanValue();
    }

    /**
     * Metodo que permite obtener la fecha y hora actual.
     * @return {@link String}
     */
    public static String getDateTime(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return ZonedDateTime.now(ZoneId.of(APIConstant.STRING_CMM_DATE_ZONE))
                    .format(DateTimeFormatter.ofPattern(APIConstant.STRING_CMM_DATE_TIME_FORMAT));
        }
        return new SimpleDateFormat(APIConstant.STRING_CMM_DATE_TIME_FORMAT).format(new Date());
    }

    /**
     * Metodo que permite generar el traceId.
     * @return {@link String}
     */
    public static String getTraceId(){
        return UUID.randomUUID().toString();
    }

    /**
     * Metodo que permite obtener el objeto en cadena.
     * @param object
     * @return {@link  String}
     */
    public static String getStringJSON(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    /**
     * Metodo que convierte un objeto a clase.
     * @param object
     * @param clazz
     * @return {@link T}
     * @param <T>
     */
    public static <T> T convertObjectToClass(Object object, Class<T> clazz){
        return convertObjectToClass(object, clazz, Boolean.FALSE.booleanValue());
    }

    /**
     * Metodo que convierte un objeto a clase.
     * @param object
     * @param clazz
     * @param isConvertJson
     * @return {@link T}
     * @param <T>
     */
    public static <T> T convertObjectToClass(Object object, Class<T> clazz, boolean isConvertJson){
        Gson gson = new Gson();
        String json;
        if(isConvertJson)
            json = gson.toJson(object);
        else
            json = object.toString();
        return gson.fromJson(json, clazz);
    }

    /**
     * Metodo que permite registrar la salida para cloud watch.
     * @param object
     */
    public static void output(Object object){
        if(object instanceof Response || object instanceof Request ||
                object instanceof DataFactory)
            System.out.println(getStringJSON(object));
        else
            System.out.println(object);
    }

    /**
     * Metodo que permite agregar propiedades.
     * @param requestProperties
     * @return {@link List}
     */
    public static List<RequestProperty> buildProperties(RequestProperty ... requestProperties){
        List<RequestProperty> properties = new ArrayList<>();
        for(RequestProperty property : requestProperties){
            properties.add(property);
        }
        return properties;
    }

    /**
     * Metodo que construye el mock de la peticion.
     * @param fileName
     * @return {@link HTTPMock}
     */
    public static HTTPMock buildHttpMock(String fileName){
        return new HTTPMock(fileName);
    }

    /**
     * Metodo que construye la petición http.
     * @param operation
     * @param request
     * @param clazz
     * @param <T>
     * @return {@link HTTP}
     */
    public static <T> HTTP<T> buildHTTP(String operation, Request request, Class<T> clazz, HTTPMock httpMock){
        String url = APIConstant.STRING_API_GATEWAY_PATH.concat(operation);
        return new HTTP<>(url, request, clazz, httpMock);
    }

    /**
     * Metodo que permite construir la peticion del servicio.
     * @param service
     * @param operation
     * @param data
     * @return {@link Request}
     */
    public static Request buildRequest(String service, String operation, Object data) {
        return APICommon.buildRequest(service, operation, new ArrayList<>(), data);
    }

    /**
     * Metodo que permite construir la peticion del servicio.
     * @param service
     * @param operation
     * @param properties
     * @param data
     * @return {@link Request}
     */
    public static Request buildRequest(String service, String operation, List<RequestProperty> properties, Object data) {
        Request request = new Request();
        request.setTraceId(APICommon.getTraceId());
        request.setDateTime(APICommon.getDateTime());
        request.setService(service);
        request.setOperation(operation);
        request.setProperties(properties);
        request.setData(data);
        return request;
    }

    /**
     * Metodo que permite construir la respuesta del servicio.
     * @param service
     * @param operation
     * @param object
     * @return {@link Response}
     */
    public static Response buildResponse(String service, String operation, Object object){
        return APICommon.buildResponse(buildRequest(service, operation, object));
    }

    /**
     * Metodo que permite construir la respuesta del servicio.
     * @param request
     * @return {@link Response}
     */
    public static Response buildResponse(Request request){
        return APICommon.buildResponse(request, null, null);
    }

    /**
     * Metodo que permite construir la respuesta del servicio.
     * @param request
     * @param status
     * @param data
     * @return {@link Response}
     */
    public static Response buildResponse(Request request, APIStatusEnum status, Object data){
        if(null == status)
            status = APIStatusEnum.ERROR;
        return new Response(request.getTraceId(),
                APICommon.getDateTime(),
                request.getService(),
                request.getOperation(),
                new ResponseStatus(
                        status.getCode(),
                        status.getMessageBackend(),
                        status.getMessageFrontend()),
                data);
    }
}
