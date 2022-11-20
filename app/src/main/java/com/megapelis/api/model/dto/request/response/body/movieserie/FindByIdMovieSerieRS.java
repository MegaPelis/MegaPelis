package com.megapelis.api.model.dto.request.response.body.movieserie;

import java.io.Serializable;

/**
 * Clase {@link FindByIdMovieSerieRS}
 * @author sergio.barrios.
 */
public class FindByIdMovieSerieRS implements Serializable {

    private String id;
    private String name;
    private String idTMDB;
    private String image;
    private String points;
    private String status;
    private String type;
    private String premiereDate;
    private String createdDate;
    private String lastModifiedDate;

    public FindByIdMovieSerieRS(){}

    public FindByIdMovieSerieRS(String id, String name, String idTMDB, String image, String points, String status, String type, String premiereDate, String createdDate, String lastModifiedDate) {
        this.id = id;
        this.name = name;
        this.idTMDB = idTMDB;
        this.image = image;
        this.points = points;
        this.status = status;
        this.type = type;
        this.premiereDate = premiereDate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
