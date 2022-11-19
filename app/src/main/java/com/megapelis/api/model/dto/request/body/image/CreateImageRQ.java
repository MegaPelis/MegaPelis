package com.megapelis.api.model.dto.request.body.image;


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
