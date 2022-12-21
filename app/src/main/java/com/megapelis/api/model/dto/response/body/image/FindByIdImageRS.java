package com.megapelis.api.model.dto.response.body.image;

public class FindByIdImageRS {
    private String id;
    private String image;
    private String createdDate;

    public FindByIdImageRS() {
    }

    public FindByIdImageRS(String id, String image, String createdDate) {
        this.id = id;
        this.image = image;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
