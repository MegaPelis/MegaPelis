package com.megapelis.api.model.dto.request.body.business;
/**
 * Clase {@link DeleteBusinessByIdRQ}
 * @author yadir.garcia.
 */
public class DeleteBusinessByIdRQ {
    private String id;

    public DeleteBusinessByIdRQ() {
    }

    public DeleteBusinessByIdRQ(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
