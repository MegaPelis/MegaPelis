package com.megapelis.api.model.dto.request.generic;

import java.io.Serializable;

/**
 * Clase {@link RequestProperty}
 * @author sergio.barrios.
 */
public class RequestProperty implements Serializable {

    private String name;
    private String value;

    public RequestProperty(){

    }

    public RequestProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
