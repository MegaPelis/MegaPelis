package com.megapelis.api.handler.impl.movieserie;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.request.generic.RequestProperty;
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS;
import com.megapelis.api.model.enums.APIServiceEnum;
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum;
import com.megapelis.api.util.APICommon;
import com.megapelis.api.util.APIConstant;
import com.megapelis.api.util.MegaPelisException;

public class FindAllMovieSerieHandler extends APIController<FindAllMovieSerieRS> {

    public FindAllMovieSerieHandler() {

        super(APIConstant.STRING_API_GATEWAY_PATH_MOVIE_SERIE,
                APICommon.buildHttpMock(APIConstant.STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_FIND_ALL_MOVIE));
    }

    @Override
    public Request buildRequest(Object object) throws MegaPelisException {
        return APICommon.buildRequest(
                APIServiceEnum.MOVIE_SERIE.getName(),
                MovieSerieOperationEnum.FIND_ALL.getName(),
                APICommon.buildProperties(
                        new RequestProperty(APIConstant.STRING_API_SERVICE_PROPERTY_SERVICE, dataFactory.getService().getName())
                ),
                object);
    }
}
