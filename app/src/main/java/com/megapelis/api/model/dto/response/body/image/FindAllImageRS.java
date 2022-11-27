package com.megapelis.api.model.dto.response.body.image;

import com.megapelis.api.model.dto.response.body.movieserie.FindByIdMovieSerieRS;

import java.util.List;

public class FindAllImageRS {

    private List<FindAllImageRS> findAll;

    public FindAllImageRS() {
    }

    public FindAllImageRS(List<FindAllImageRS> findAll) {
        this.findAll = findAll;
    }

    public List<FindAllImageRS> getFindAll() {
        return findAll;
    }

    public void setFindAll(List<FindAllImageRS> findAll) {
        this.findAll = findAll;
    }
}
