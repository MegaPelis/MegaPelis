package com.megapelis.api.model.enums;

/**
 * Clase {@link MovieSerieOperationEnum}
 * @author sergio.barrios.
 */
public enum MovieSerieOperationEnum {

    FIND_BY_ID("findById"),
    FIND_ALL("findAll"),
    SAVE("save"),
    UPDATE("update"),
    UPDATE_STATUS("updateStatus");

    private String name;

    MovieSerieOperationEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
