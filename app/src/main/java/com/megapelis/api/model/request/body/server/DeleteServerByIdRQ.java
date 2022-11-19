package com.megapelis.api.model.request.body.server;

/**
 * Clase {@link DeleteServerByIdRQ}
 *
 * @author yadir.garcia.
 */
public class DeleteServerByIdRQ {
    private String id;

    public DeleteServerByIdRQ() {
    }

    public DeleteServerByIdRQ(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
