package com.megapelis.api.model.dto.response.body.image;


import java.util.List;

public class FindAllImageRS {

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
