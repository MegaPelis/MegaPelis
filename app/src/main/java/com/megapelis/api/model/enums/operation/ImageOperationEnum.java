package com.megapelis.api.model.enums.operation;

import org.jetbrains.annotations.NotNull;

public enum ImageOperationEnum {
    CREATE("create"),
    FIND_ALL("findAll"),
    DELETE("delete"),
    UPDATE("update");

    private String name;

    ImageOperationEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
