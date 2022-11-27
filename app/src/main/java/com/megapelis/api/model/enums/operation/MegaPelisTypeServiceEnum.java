package com.megapelis.api.model.enums.operation;

/**
 * Clase {@link MegaPelisTypeServiceEnum}
 * @author sergio.barrios.
 */
public enum MegaPelisTypeServiceEnum {

    MOVIE("movie"),
    SERIE("serie"),
    IMAGE("image");

    private String name;

    MegaPelisTypeServiceEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
