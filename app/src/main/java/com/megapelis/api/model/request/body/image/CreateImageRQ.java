package com.megapelis.api.model.request.body.image;

import com.megapelis.api.model.request.body.tmdb.serie.FindAllByPopularSerieRQ;

/**
 * Clase {@link CreateImageRQ}
 * @author yadir.garcia.
 */
public class CreateImageRQ {
    private String image;

    public CreateImageRQ() {
    }

    public CreateImageRQ(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
