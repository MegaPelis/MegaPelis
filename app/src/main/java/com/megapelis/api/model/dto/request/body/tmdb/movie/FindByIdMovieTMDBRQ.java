package com.megapelis.api.model.dto.request.body.tmdb.movie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdMovieTMDBRQ}
 * @author sergio.barrios.
 */
public class FindByIdMovieTMDBRQ implements Serializable {

    private String idMovie;

    public FindByIdMovieTMDBRQ(){}

    public FindByIdMovieTMDBRQ(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }
}
