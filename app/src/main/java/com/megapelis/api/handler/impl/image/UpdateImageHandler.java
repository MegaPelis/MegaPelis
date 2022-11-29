package com.megapelis.api.handler.impl.image;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.model.dto.request.generic.Request;
import com.megapelis.api.model.dto.response.body.image.DeleteImageRS;
import com.megapelis.api.model.dto.response.body.image.UpdateImageRS;
import com.megapelis.api.model.http.HTTPMock;
import com.megapelis.api.util.APICommon;
import com.megapelis.api.util.APIConstant;
import com.megapelis.api.util.MegaPelisException;

public class UpdateImageHandler extends APIController<UpdateImageRS> {
    public UpdateImageHandler() {
        super(APIConstant.STRING_API_GATEWAY_PATH_IMAGE,
                APICommon.buildHttpMock(APIConstant.STRING_API_MOCK_PATH_IMAGE_JSON_FIND_ALL_IMAGE));
    }

    @Override
    public Request buildRequest(Object object) throws MegaPelisException {
return null;
    }
}
