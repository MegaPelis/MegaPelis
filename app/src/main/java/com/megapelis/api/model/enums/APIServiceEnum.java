package com.megapelis.api.model.enums;

import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum;

/**
 * Clase {@link APIServiceEnum}
 * @author sergio.barrios.
 */
public enum APIServiceEnum {

    MOVIE_SERIE("MovieSerie"),
    MOVIE_TMDB("MovieTMDB"),
    SERIE_TMDB("SerieTMDB"),
    IMAGE("images");

    private String name;

    APIServiceEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
