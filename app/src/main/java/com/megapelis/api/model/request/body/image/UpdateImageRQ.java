package com.megapelis.api.model.request.body.image;
/**
 * Clase {@link UpdateImageRQ}
 * @author yadir.garcia.
 */
public class UpdateImageRQ {
    private String id;
    private String image;

    public UpdateImageRQ() {
    }

    public UpdateImageRQ(String id, String image) {
        this.id = id;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
