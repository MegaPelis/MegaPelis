package com.megapelis.api.model.dto.request.body.movieserie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdMovieSerieRQ}
 * @author sergio.barrios.
 */
public class FindByIdMovieSerieRQ implements Serializable {

    private String idTMDB;

    public FindByIdMovieSerieRQ(){
    }

    public FindByIdMovieSerieRQ(String idTMDB) {
        this.idTMDB = idTMDB;
    }

    public String getIdTMDB() {
        return idTMDB;
    }

    public void setIdTMDB(String idTMDB) {
        this.idTMDB = idTMDB;
    }
}
