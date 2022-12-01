package com.megapelis.api.factory;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.handler.impl.tmdb.movie.FindAllByPopularMovieTMDBHandler;
import com.megapelis.api.handler.impl.tmdb.movie.FindAllImagesByIdMovieTMDBHandler;
import com.megapelis.api.handler.impl.tmdb.movie.FindAllVideoByIdMovieTMDBHandler;
import com.megapelis.api.handler.impl.tmdb.movie.FindByIdMovieTMDBHandler;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.enums.operation.MovieTMDBOperationEnum;
import com.megapelis.api.model.factory.DataFactory;
import com.megapelis.api.util.APICommon;

public class MovieTMDBFactory {

    private MovieTMDBFactory(){}

    /**
     * Fabrica de pelicula y serie que permite ejecutar mediante la operación.
     * @param data
     * @param operation
     * @param <T>
     * @return
     */
    public static <T> Response handler(DataFactory<T> data, MovieTMDBOperationEnum operation){
        APIController handler = null;
        switch (operation){
            case FIND_BY_ID:
                handler = new FindByIdMovieTMDBHandler();
                break;
            case FIND_ALL_IMAGES_BY_ID:
                //handler = new FindAllImagesByIdMovieTMDBHandler();
                break;
            case FIND_ALL_VIDEO_BY_ID:
                //handler = new FindAllVideoByIdMovieTMDBHandler();
                break;
            case FIND_ALL_BY_POPULAR:
                handler = new FindAllByPopularMovieTMDBHandler();
                break;
            default:
                handler = null;
                break;
        }
        if(null != handler)
            return handler.execute(data);
        return APICommon.buildResponse(data.getService().getName(), operation.getName(), data.getData());
    }
}
