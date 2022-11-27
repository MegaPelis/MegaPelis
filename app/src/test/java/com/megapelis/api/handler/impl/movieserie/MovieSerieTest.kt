package com.megapelis.api.handler.impl.movieserie

import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.response.body.movieserie.FindByIdMovieSerieRS
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
class MovieSerieTest {

    @Test
    fun findAllMovie() {
        var dataFactory : DataFactory<FindAllMovieSerieRS> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, null, FindAllMovieSerieRS::class.java);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_ALL);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun findAllSerie() {
        var dataFactory : DataFactory<FindAllMovieSerieRS> = DataFactory(MegaPelisTypeServiceEnum.SERIE, null, FindAllMovieSerieRS::class.java);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_ALL);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun findByIdMovie(){
        var dataFactory : DataFactory<FindByIdMovieSerieRS> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, null, FindByIdMovieSerieRS::class.java);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_BY_ID);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun findByIdSerie(){
        var dataFactory : DataFactory<FindByIdMovieSerieRS> = DataFactory(MegaPelisTypeServiceEnum.SERIE, null, FindByIdMovieSerieRS::class.java);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_BY_ID);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun saveMovie(){
        var dataFactory : DataFactory<Object> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, null, null);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.SAVE);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun saveSerie(){
        var dataFactory : DataFactory<Object> = DataFactory(MegaPelisTypeServiceEnum.SERIE, null, null);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.SAVE);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun updateMovie(){
        var dataFactory : DataFactory<Object> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, null, null);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.UPDATE);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun updateSerie(){
        var dataFactory : DataFactory<Object> = DataFactory(MegaPelisTypeServiceEnum.SERIE, null, null);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.UPDATE);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun updateStatusMovie(){
        var dataFactory : DataFactory<Object> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, null, null);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.UPDATE_STATUS);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun updateStatusSerie(){
        var dataFactory : DataFactory<Object> = DataFactory(MegaPelisTypeServiceEnum.SERIE, null, null);
        var response : Response = MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.UPDATE_STATUS);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }
}