package com.megapelis.api.handler;

import com.megapelis.api.http.RequestHTTP;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.http.HTTP;

public abstract class APIController<T> {

    private RequestHTTP<T> requestHTTP;

    public APIController(){
        requestHTTP = new RequestHTTP<>();
    }

    public Response execute(Object object, Class<T> clazz){
        Response response = null;
        try{
            Request request = build(object);
            HTTP<T> http = buildHttp();
            response = requestHTTP.post(http);
        }catch (Exception exception){

        }
        return response;
    }

    public abstract Request build(Object object);

    public abstract HTTP<T> buildHttp();
}
