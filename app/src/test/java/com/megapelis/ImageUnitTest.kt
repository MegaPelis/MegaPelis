package com.megapelis

import com.megapelis.api.factory.ImageFactory
import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.APIStatusEnum
import com.megapelis.api.model.enums.operation.ImageOperationEnum
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon
import org.junit.Assert
import org.junit.Test

class ImageUnitTest {
    @Test
    fun success() {
        var dataFactory : DataFactory<FindAllImageRS> = DataFactory(MegaPelisTypeServiceEnum.IMAGE, null, FindAllImageRS::class.java);
        var response : Response = ImageFactory.handler(dataFactory, ImageOperationEnum.FIND_ALL);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }
}