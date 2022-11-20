package com.megapelis.api.handler.impl.movieserie;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.util.APIConstant;

public class UpdateStatusMovieSerieHandler extends APIController<Object> {
    public UpdateStatusMovieSerieHandler() {
        super(APIConstant.STRING_API_GATEWAY_PATH_MOVIE_SERIE, null);
    }

    @Override
    public Request buildRequest(Object object) {
        return null;
    }
}
