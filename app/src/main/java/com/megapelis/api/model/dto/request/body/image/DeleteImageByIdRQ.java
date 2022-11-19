package com.megapelis.api.model.dto.request.body.image;
/**
 * Clase {@link DeleteImageByIdRQ}
 * @author yadir.garcia.
 */
public class DeleteImageByIdRQ {
    private String id;

    public DeleteImageByIdRQ() {
    }

    public DeleteImageByIdRQ(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
