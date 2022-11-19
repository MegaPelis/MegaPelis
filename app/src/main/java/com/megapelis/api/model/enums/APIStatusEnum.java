package com.megapelis.api.model.enums;

/**
 * Clase {@link APIStatusEnum}
 * @author sergio.barrios.
 */
public enum APIStatusEnum {

    SUCCESS("200");

    private final String code;

    APIStatusEnum(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
