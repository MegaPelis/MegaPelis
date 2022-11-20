package com.megapelis.api.model.dto.request.response.body.movieserie;

import java.io.Serializable;
import java.util.List;

/**
 * Clase {@link FindAllMovieSerieRS}
 * @author sergio.barrios.
 */
public class FindAllMovieSerieRS implements Serializable {

    private List<FindByIdMovieSerieRS> findAll;

    public FindAllMovieSerieRS(){}

    public FindAllMovieSerieRS(List<FindByIdMovieSerieRS> findAll) {
        this.findAll = findAll;
    }

    public List<FindByIdMovieSerieRS> getFindAll() {
        return findAll;
    }

    public void setFindAll(List<FindByIdMovieSerieRS> findAll) {
        this.findAll = findAll;
    }
}
