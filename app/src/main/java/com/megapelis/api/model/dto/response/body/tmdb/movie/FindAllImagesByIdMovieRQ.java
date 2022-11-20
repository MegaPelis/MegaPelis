package com.megapelis.api.model.dto.response.body.tmdb.movie;

import java.io.Serializable;

/**
 * Clase {@link FindAllImagesByIdMovieRQ}
 * @author sergio.barrios.
 */
public class FindAllImagesByIdMovieRQ implements Serializable {

    private String idMovie;

    public FindAllImagesByIdMovieRQ(){}

    public FindAllImagesByIdMovieRQ(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }
}
