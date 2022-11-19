package com.megapelis.api.model.request.body.tmdb.movie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdMovieRQ}
 * @author sergio.barrios.
 */
public class FindByIdMovieRQ implements Serializable {

    private String idMovie;

    public FindByIdMovieRQ(){}

    public FindByIdMovieRQ(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }
}
