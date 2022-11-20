package com.megapelis.api.model.factory;

import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum;

import java.io.Serializable;

/**
 * Clase {@link DataFactory}
 * @author sergio.barrios.
 */
public class DataFactory<T> implements Serializable {

    private MegaPelisTypeServiceEnum service;
    private Object data;
    private Class<T> bodyResponse;

    public DataFactory() {
    }

    public DataFactory(MegaPelisTypeServiceEnum service, Object data, Class<T> bodyResponse) {
        this.service = service;
        this.data = data;
        this.bodyResponse = bodyResponse;
    }

    public MegaPelisTypeServiceEnum getService() {
        return service;
    }

    public void setService(MegaPelisTypeServiceEnum service) {
        this.service = service;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Class<T> getBodyResponse() {
        return bodyResponse;
    }

    public void setBodyResponse(Class<T> bodyResponse) {
        this.bodyResponse = bodyResponse;
    }
}
