package com.megapelis.api.model.http;

import com.megapelis.api.model.dto.request.generic.Request;

import java.io.Serializable;

public class HTTP<T> implements Serializable {

    private String url;
    private boolean output;
    private boolean input;
    private String contentType;
    private String accept;
    private String method;
    private Request request;
    private Class<T> response;

    public HTTP(String url, Request request, Class<T> response) {
        this.url = url;
        this.request = request;
        this.response = response;
    }

    public void build(boolean output, boolean input, String contentType, String accept, String method){
        this.output = output;
        this.input = input;
        this.contentType = contentType;
        this.accept = accept;
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isOutput() {
        return output;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    public boolean isInput() {
        return input;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Class<T> getResponse() {
        return response;
    }

    public void setResponse(Class<T> response) {
        this.response = response;
    }
}
