package com.megapelis.api.model.dto.response.body.tmdb.movie;

import java.io.Serializable;
import java.util.List;

/**
 * Clase {@link FindAllByPopularMovieTMDBRS}
 * @author sergio.barrios.
 */
public class FindAllByPopularMovieTMDBRS implements Serializable {

    private boolean adult;
    private String backdrop_path;
    private List<Long> genre_ids;
    private long id;
    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private String release_date;
    private String title;
    private boolean video;
    private double vote_average;
    private long vote_count;
}
