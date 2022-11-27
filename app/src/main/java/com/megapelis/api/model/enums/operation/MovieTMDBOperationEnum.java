package com.megapelis.api.model.enums.operation;

/**
 * Clase {@link MovieTMDBOperationEnum}
 * @author sergio.barrios.
 */
public enum MovieTMDBOperationEnum {

    FIND_BY_ID("findById"),
    FIND_ALL_IMAGES_BY_ID("findAllImagesById"),
    FIND_ALL_VIDEO_BY_ID("findAllVideoById"),
    FIND_ALL_BY_POPULAR("findAllByPopular");

    private String name;

    MovieTMDBOperationEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
