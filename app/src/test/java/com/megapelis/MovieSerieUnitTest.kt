package com.megapelis

import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon
import com.megapelis.api.model.enums.APIStatusEnum
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MovieSerieUnitTest {
    @Test
    fun success() {
        var dataFactory : DataFactory<FindAllMovieSerieRS> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, 1, FindAllMovieSerieRS::class.java);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_ALL);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }
}