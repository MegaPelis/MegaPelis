package com.megapelis.api.model.dto.response.generic;

import java.io.Serializable;

/**
 * Clase {@link Response}
 * @author sergio.barrios.
 */
public class Response implements Serializable {
    private String traceId;
    private String dateTime;
    private String service;
    private String operation;
    private ResponseStatus status;
    private Object data;

    public Response() {
    }

    public Response(String traceId, String dateTime, String service, String operation, ResponseStatus status, Object data) {
        this.traceId = traceId;
        this.dateTime = dateTime;
        this.service = service;
        this.operation = operation;
        this.status = status;
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

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
