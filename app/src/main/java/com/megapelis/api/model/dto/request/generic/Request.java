package com.megapelis.api.model.dto.request.generic;

import java.io.Serializable;
import java.util.List;

/**
 * Clase {@link Request}
 * @author sergio.barrios.
 */
public class Request implements Serializable {
    private String traceId;
    private String dateTime;
    private String service;
    private String operation;
    private List<RequestProperty> properties;
    private Object data;

    public Request(String traceId, String dateTime, String service, String operation, List<RequestProperty> properties, Object data) {
        this.traceId = traceId;
        this.dateTime = dateTime;
        this.service = service;
        this.operation = operation;
        this.properties = properties;
        this.data = data;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public List<RequestProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<RequestProperty> properties) {
        this.properties = properties;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
