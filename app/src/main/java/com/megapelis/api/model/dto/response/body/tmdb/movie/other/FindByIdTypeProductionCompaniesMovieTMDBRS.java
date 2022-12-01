package com.megapelis.api.model.dto.response.body.tmdb.movie.other;

import java.io.Serializable;

public class FindByIdTypeProductionCompaniesMovieTMDBRS implements Serializable {

    private long id;
    private String logo_path;
    private String name;
    private String origin_country;

    public FindByIdTypeProductionCompaniesMovieTMDBRS(){}

    public FindByIdTypeProductionCompaniesMovieTMDBRS(long id, String logo_path, String name, String origin_country) {
        this.id = id;
        this.logo_path = logo_path;
        this.name = name;
        this.origin_country = origin_country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogo_path() {
        return logo_path;
    }

    public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }
}
