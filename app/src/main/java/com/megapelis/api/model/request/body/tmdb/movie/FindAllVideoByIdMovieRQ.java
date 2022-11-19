package com.megapelis.api.model.request.body.tmdb.movie;

import java.io.Serializable;

/**
 * Clase {@link FindAllVideoByIdMovieRQ}
 * @author sergio.barrios.
 */
public class FindAllVideoByIdMovieRQ implements Serializable {

    private String idMovie;

    public FindAllVideoByIdMovieRQ(){}

    public FindAllVideoByIdMovieRQ(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }
}
