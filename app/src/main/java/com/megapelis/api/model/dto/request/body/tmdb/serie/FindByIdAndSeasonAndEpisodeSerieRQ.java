package com.megapelis.api.model.dto.request.body.tmdb.serie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdAndSeasonAndEpisodeSerieRQ}
 * @author sergio.barrios.
 */
public class FindByIdAndSeasonAndEpisodeSerieRQ implements Serializable {

    private String idSerie;
    private String season;
    private String episode;

    public FindByIdAndSeasonAndEpisodeSerieRQ(){}

    public FindByIdAndSeasonAndEpisodeSerieRQ(String idSerie, String season, String episode) {
        this.idSerie = idSerie;
        this.season = season;
        this.episode = episode;
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

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }
}
