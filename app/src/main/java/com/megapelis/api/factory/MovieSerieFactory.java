package com.megapelis.api.factory;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.handler.impl.movieserie.FindAllMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.FindByIdMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.SaveMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.UpdateMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.UpdateStatusMovieSerieHandler;
import com.megapelis.api.model.dto.request.response.generic.Response;
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum;
import com.megapelis.api.model.factory.DataFactory;
import com.megapelis.api.util.APICommon;

/**
 * Clase {@link MovieSerieFactory}
 * @author sergio.barrios.
 */
public class MovieSerieFactory {

    private MovieSerieFactory(){}

    /**
     * Fabrica de pelicula y serie que permite ejecutar mediante la operación.
     * @param data
     * @param operation
     * @param <T>
     * @return
     */
    public static <T> Response handler(DataFactory<T> data, MovieSerieOperationEnum operation){
        APIController handler;
        switch (operation){
            case FIND_BY_ID:
                handler = new FindByIdMovieSerieHandler();
                break;
            case FIND_ALL:
                handler = new FindAllMovieSerieHandler();
                break;
            case SAVE:
                handler = new SaveMovieSerieHandler();
                break;
            case UPDATE:
                handler = new UpdateMovieSerieHandler();
                break;
            case UPDATE_STATUS:
                handler = new UpdateStatusMovieSerieHandler();
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
