package com.megapelis.api.model.enums;

/**
 * Clase {@link MegaPelisTypeServiceEnum}
 * @author sergio.barrios.
 */
public enum MegaPelisTypeServiceEnum {

    MOVIE("movie"),
    SERIE("serie");

    private String name;

    MegaPelisTypeServiceEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
