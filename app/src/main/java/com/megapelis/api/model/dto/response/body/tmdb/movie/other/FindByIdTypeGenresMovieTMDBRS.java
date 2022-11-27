package com.megapelis.api.model.dto.response.body.tmdb.movie.other;

import java.io.Serializable;

public class FindByIdTypeGenresMovieTMDBRS implements Serializable {

    private long id;
    private String name;

    public FindByIdTypeGenresMovieTMDBRS(){}

    public FindByIdTypeGenresMovieTMDBRS(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
