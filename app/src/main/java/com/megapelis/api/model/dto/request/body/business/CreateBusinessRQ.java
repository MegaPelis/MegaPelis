package com.megapelis.api.model.dto.request.body.business;

/**
 * Clase {@link CreateBusinessRQ}
 * @author yadir.garcia.
 */
public class CreateBusinessRQ {
    private String name;
    private String description;

    public CreateBusinessRQ() {
    }

    public CreateBusinessRQ(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
