package com.megapelis.api.handler.impl.movieserie

import com.megapelis.api.factory.MovieTMDBFactory
import com.megapelis.api.model.dto.request.body.tmdb.movie.FindAllByPopularMovieTMDBRQ
import com.megapelis.api.model.dto.request.body.tmdb.movie.FindByIdMovieTMDBRQ
import com.megapelis.api.model.dto.response.body.tmdb.movie.FindAllByPopularMovieTMDBRS
import com.megapelis.api.model.dto.response.body.tmdb.movie.FindByIdMovieTMDBRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.APIStatusEnum
import com.megapelis.api.model.enums.operation.MovieTMDBOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon
import org.junit.Assert
import org.junit.Test

class MovieTMDBTest {

    @Test
    fun findById() {
        var findById : FindByIdMovieTMDBRQ = FindByIdMovieTMDBRQ("1402")
        var dataFactory : DataFactory<FindByIdMovieTMDBRS> = DataFactory(null, findById, FindByIdMovieTMDBRS::class.java);
        var response : Response = MovieTMDBFactory.handler(dataFactory, MovieTMDBOperationEnum.FIND_BY_ID);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }

    @Test
    fun findAllByPopular() {
        var findAllByPopular : FindAllByPopularMovieTMDBRQ = FindAllByPopularMovieTMDBRQ(1)
        var dataFactory : DataFactory<FindAllByPopularMovieTMDBRS> = DataFactory(null, findAllByPopular, FindAllByPopularMovieTMDBRS::class.java);
        var response : Response = MovieTMDBFactory.handler(dataFactory, MovieTMDBOperationEnum.FIND_ALL_BY_POPULAR);
        APICommon.output(response);
        Assert.assertEquals(APIStatusEnum.SUCCESS.code, response.status.code)
    }
}