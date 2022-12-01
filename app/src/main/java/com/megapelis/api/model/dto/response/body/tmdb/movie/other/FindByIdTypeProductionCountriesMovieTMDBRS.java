package com.megapelis.api.model.dto.response.body.tmdb.movie.other;

import java.io.Serializable;

public class FindByIdTypeProductionCountriesMovieTMDBRS implements Serializable {

    private String iso_3166_1;
    private String name;

    public FindByIdTypeProductionCountriesMovieTMDBRS(){}

    public FindByIdTypeProductionCountriesMovieTMDBRS(String iso_3166_1, String name) {
        this.iso_3166_1 = iso_3166_1;
        this.name = name;
    }

    public String getIso_3166_1() {
        return iso_3166_1;
    }

    public void setIso_3166_1(String iso_3166_1) {
        this.iso_3166_1 = iso_3166_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
