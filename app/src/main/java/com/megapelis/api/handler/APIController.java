package com.megapelis.api.handler;

import com.megapelis.api.http.RequestHTTP;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.http.HTTP;

/**
 * Clase {@link APIController}
 * @author sergio.barrios.
 */
public abstract class APIController<T> {

    private RequestHTTP<T> requestHTTP;
    private Request request;

    public APIController(){
        requestHTTP = new RequestHTTP<>();
    }

    /**
     * Metodo que permite realizar la petición
     * @param object
     * @param clazz
     * @return {@link Response}
     */
    public Response execute(Object object, Class<T> clazz){
        Response response = null;
        try{
            request = buildRequest(object);
            HTTP<T> http = buildHttp();
            response = requestHTTP.post(http);
        }catch (Exception exception){

        }
        return response;
    }

    /**
     * Metodo que permite construir el request;
     * @param object
     * @return {@link Request}
     */
    public abstract Request buildRequest(Object object);

    /**
     * Metodo que permite construir el objeto http.
     * @return {@link HTTP}
     */
    public abstract HTTP<T> buildHttp();
}
