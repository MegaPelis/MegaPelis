package com.megapelis.api.model.dto.request.response.body.tmdb.serie;

import java.io.Serializable;

/**
 * Clase {@link FindAllByPopularSerieRQ}
 * @author sergio.barrios.
 */
public class FindAllByPopularSerieRQ implements Serializable {

    private int page;

    public FindAllByPopularSerieRQ(){
    }

    public FindAllByPopularSerieRQ(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
