package com.megapelis.api.model.request.body.movieserie;

import java.io.Serializable;

/**
 * Clase {@link UpdateMovieSerieRQ}
 * @author sergio.barrios.
 */
public class UpdateMovieSerieRQ implements Serializable {

    private String id;
    private String name;
    private String idTMDB;
    private String premiereDate;
    private String image;
    private String points;

    public UpdateMovieSerieRQ() {
    }

    public UpdateMovieSerieRQ(String id, String name, String idTMDB, String premiereDate, String image, String points) {
        this.id = id;
        this.name = name;
        this.idTMDB = idTMDB;
        this.premiereDate = premiereDate;
        this.image = image;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdTMDB() {
        return idTMDB;
    }

    public void setIdTMDB(String idTMDB) {
        this.idTMDB = idTMDB;
    }

    public String getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
