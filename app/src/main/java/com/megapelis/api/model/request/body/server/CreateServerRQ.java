package com.megapelis.api.model.request.body.server;

import com.megapelis.api.model.request.body.image.CreateImageRQ;

/**
 * Clase {@link CreateServerRQ}
 * @author yadir.garcia.
 */
public class CreateServerRQ {
    private String name;
    private String imageBase64;
    public CreateServerRQ() {
    }

    public CreateServerRQ(String name, String imageBase64) {
        this.name = name;
        this.imageBase64 = imageBase64;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }
}
