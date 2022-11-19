package com.megapelis.api.model.request.body.tmdb.serie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdSerieRQ}
 * @author sergio.barrios.
 */
public class FindByIdSerieRQ implements Serializable {

    private String idSerie;

    public FindByIdSerieRQ(){}

    public FindByIdSerieRQ(String idSerie) {
        this.idSerie = idSerie;
    }

    public String getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(String idSerie) {
        this.idSerie = idSerie;
    }
}
