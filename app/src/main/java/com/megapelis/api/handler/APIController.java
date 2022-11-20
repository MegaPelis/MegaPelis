package com.megapelis.api.handler;

import com.megapelis.api.http.RequestHTTP;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.factory.DataFactory;
import com.megapelis.api.model.http.HTTP;
import com.megapelis.api.model.http.HTTPMock;
import com.megapelis.api.util.APICommon;
import com.megapelis.api.util.MegaPelisException;

/**
 * Clase {@link APIController}
 * @author sergio.barrios.
 */
public abstract class APIController<T> {

    protected RequestHTTP<T> requestHTTP;
    protected HTTPMock mock;
    protected Request request;
    protected DataFactory<T> dataFactory;
    protected String operation;

    public APIController(String operation, HTTPMock mock){
        this.operation = operation;
        this.mock = mock;
        requestHTTP = new RequestHTTP<>();
    }

    /**
     * Metodo que permite realizar la petición
     * @param dataFactory
     * @return {@link Response}
     */
    public Response execute(DataFactory<T> dataFactory){
        Response response = null;
        try{
            this.dataFactory = dataFactory;
            this.request = buildRequest(dataFactory.getData());
            HTTP<T> http = APICommon.buildHTTP(this.operation, this.request, this.dataFactory.getBodyResponse(), this.mock);
            response = requestHTTP.post(http);
        }catch (Exception exception){
            APICommon.output(exception);
            response = APICommon.buildResponse(request);
        }
        return response;
    }

    /**
     * Metodo que permite construir el request;
     * @param object
     * @return {@link Request}
     */
    public abstract Request buildRequest(Object object) throws MegaPelisException;
}
