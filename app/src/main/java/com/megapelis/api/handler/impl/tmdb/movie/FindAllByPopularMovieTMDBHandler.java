package com.megapelis.api.handler.impl.tmdb.movie;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.response.body.tmdb.movie.FindAllByPopularMovieTMDBRS;
import com.megapelis.api.model.enums.APIServiceEnum;
import com.megapelis.api.model.enums.operation.MovieTMDBOperationEnum;
import com.megapelis.api.util.APICommon;
import com.megapelis.api.util.APIConstant;
import com.megapelis.api.util.MegaPelisException;

import java.util.ArrayList;

public class FindAllByPopularMovieTMDBHandler extends APIController<FindAllByPopularMovieTMDBRS> {

    public FindAllByPopularMovieTMDBHandler(){
        super(APIConstant.STRING_API_GATEWAY_PATH_MOVIE,
                APICommon.buildHttpMock(APIConstant.STRING_API_MOCK_PATH_MOVIE_TMDB_JSON_FIND_ALL_POPULAR));
    }

    @Override
    public Request buildRequest(Object object) throws MegaPelisException {
        return APICommon.buildRequest(
                APIServiceEnum.MOVIE_TMDB.getName(),
                MovieTMDBOperationEnum.FIND_ALL_BY_POPULAR.getName(),
                new ArrayList<>(), object);
    }
}
