package com.megapelis.api.model.dto.response.body.tmdb.movie;

import java.io.Serializable;

/**
 * Clase {@link FindAllByPopularMovieRQ}
 * @author sergio.barrios.
 */
public class FindAllByPopularMovieRQ implements Serializable {

    private int page;

    public FindAllByPopularMovieRQ(){}

    public FindAllByPopularMovieRQ(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
