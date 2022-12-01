package com.megapelis.api.model.dto.request.body.tmdb.movie;

import java.io.Serializable;

/**
 * Clase {@link FindAllByPopularMovieTMDBRQ}
 * @author sergio.barrios.
 */
public class FindAllByPopularMovieTMDBRQ implements Serializable {

    private int page;

    public FindAllByPopularMovieTMDBRQ(){}

    public FindAllByPopularMovieTMDBRQ(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
