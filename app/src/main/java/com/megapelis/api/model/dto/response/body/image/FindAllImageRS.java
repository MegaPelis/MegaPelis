package com.megapelis.api.model.dto.response.body.image;


import java.io.Serializable;
import java.util.List;

public class FindAllImageRS implements Serializable {

    private List<FindByIdImageRS> findAll;

    public FindAllImageRS() {
    }

    public FindAllImageRS(List<FindByIdImageRS> findAll) {
        this.findAll = findAll;
    }

    public List<FindByIdImageRS> getFindAll() {
        return findAll;
    }

    public void setFindAll(List<FindByIdImageRS> findAll) {
        this.findAll = findAll;
    }
}
