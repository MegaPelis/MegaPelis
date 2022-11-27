package com.megapelis.api.model.dto.response.body.tmdb.movie;

import com.megapelis.api.model.dto.response.body.tmdb.movie.other.FindByIdTypeGenresMovieTMDBRS;
import com.megapelis.api.model.dto.response.body.tmdb.movie.other.FindByIdTypeProductionCompaniesMovieTMDBRS;
import com.megapelis.api.model.dto.response.body.tmdb.movie.other.FindByIdTypeProductionCountriesMovieTMDBRS;
import com.megapelis.api.model.dto.response.body.tmdb.movie.other.FindByIdTypeSpokenLanguagesMovieTMDBRS;

import java.io.Serializable;
import java.util.List;

/**
 * Clase {@link FindByIdMovieTMDBRS}
 * @author sergio.barrios.
 */
public class FindByIdMovieTMDBRS implements Serializable {

    private boolean adult;
    private String backdrop_path;
    private long budget;
    private List<FindByIdTypeGenresMovieTMDBRS> genres;
    private String homepage;
    private long id;
    private String imdb_id;
    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster_path;
    private List<FindByIdTypeProductionCompaniesMovieTMDBRS> production_companies;
    private List<FindByIdTypeProductionCountriesMovieTMDBRS> production_countries;
    private String release_date;
    private long revenue;
    private long runtime;
    private List<FindByIdTypeSpokenLanguagesMovieTMDBRS> spoken_languages;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    private double vote_average;
    private long vote_count;

    public FindByIdMovieTMDBRS(){}


    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public List<FindByIdTypeGenresMovieTMDBRS> getGenres() {
        return genres;
    }

    public void setGenres(List<FindByIdTypeGenresMovieTMDBRS> genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public List<FindByIdTypeProductionCompaniesMovieTMDBRS> getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(List<FindByIdTypeProductionCompaniesMovieTMDBRS> production_companies) {
        this.production_companies = production_companies;
    }

    public List<FindByIdTypeProductionCountriesMovieTMDBRS> getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(List<FindByIdTypeProductionCountriesMovieTMDBRS> production_countries) {
        this.production_countries = production_countries;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    public List<FindByIdTypeSpokenLanguagesMovieTMDBRS> getSpoken_languages() {
        return spoken_languages;
    }

    public void setSpoken_languages(List<FindByIdTypeSpokenLanguagesMovieTMDBRS> spoken_languages) {
        this.spoken_languages = spoken_languages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public long getVote_count() {
        return vote_count;
    }

    public void setVote_count(long vote_count) {
        this.vote_count = vote_count;
    }
}
