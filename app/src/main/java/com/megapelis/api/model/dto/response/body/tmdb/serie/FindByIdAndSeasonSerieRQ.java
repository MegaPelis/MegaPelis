package com.megapelis.api.model.dto.response.body.tmdb.serie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdAndSeasonSerieRQ}
 * @author sergio.barrios.
 */
public class FindByIdAndSeasonSerieRQ implements Serializable {

    private String idSerie;
    private String season;

    public FindByIdAndSeasonSerieRQ(){}

    public FindByIdAndSeasonSerieRQ(String idSerie, String season) {
        this.idSerie = idSerie;
        this.season = season;
    }

    public String getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(String idSerie) {
        this.idSerie = idSerie;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
