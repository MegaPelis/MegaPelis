package com.megapelis.api.model.request.body.movieserie;

import java.io.Serializable;

/**
 * Clase {@link UpdateStatusMovieSerieRQ}
 * @author sergio.barrios.
 */
public class UpdateStatusMovieSerieRQ implements Serializable {

    private String id;
    private String status;

    public UpdateStatusMovieSerieRQ() {
    }

    public UpdateStatusMovieSerieRQ(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
