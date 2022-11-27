package com.megapelis.api.model.enums.operation;

/**
 * Clase {@link SerieTMDBOperationEnum}
 * @author sergio.barrios.
 */
public enum SerieTMDBOperationEnum {

    FIND_BY_ID("findById"),
    FIND_BY_ID_AND_SEASON("findByIdAndSeason"),
    FIND_BY_ID_AND_SEASON_AND_EPISODE("findByIdAndSeasonAndEpisode"),
    FIND_ALL_BY_POPULAR("findAllByPopular");

    private String name;

    SerieTMDBOperationEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
