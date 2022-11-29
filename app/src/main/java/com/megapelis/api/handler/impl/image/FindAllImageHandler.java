package com.megapelis.api.handler.impl.image;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.request.generic.RequestProperty;
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS;
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS;
import com.megapelis.api.model.enums.APIServiceEnum;
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum;
import com.megapelis.api.util.APICommon;
import com.megapelis.api.util.APIConstant;
import com.megapelis.api.util.MegaPelisException;

public class FindAllImageHandler extends APIController<FindAllImageRS> {

    public FindAllImageHandler() {
                super(APIConstant.STRING_API_GATEWAY_PATH_IMAGE, APICommon.buildHttpMock(APIConstant.STRING_API_MOCK_PATH_IMAGE_JSON_FIND_ALL_IMAGE));
    }

    @Override
    public Request buildRequest(Object object) throws MegaPelisException {
        return APICommon.buildRequest(
                APIServiceEnum.IMAGE.getName(),
                MovieSerieOperationEnum.FIND_ALL.getName(),
                APICommon.buildProperties(
                        new RequestProperty(APIConstant.STRING_API_SERVICE_PROPERTY_SERVICE, dataFactory.getService().getName())
                ),
                object);
    }
}
