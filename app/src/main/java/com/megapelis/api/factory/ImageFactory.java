package com.megapelis.api.factory;

import com.megapelis.api.handler.APIController;
import com.megapelis.api.handler.impl.image.CreateImageHandler;
import com.megapelis.api.handler.impl.image.DeleteImageHandler;
import com.megapelis.api.handler.impl.image.FindAllImageHandler;
import com.megapelis.api.handler.impl.image.UpdateImageHandler;
import com.megapelis.api.handler.impl.movieserie.FindAllMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.FindByIdMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.SaveMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.UpdateMovieSerieHandler;
import com.megapelis.api.handler.impl.movieserie.UpdateStatusMovieSerieHandler;
import com.megapelis.api.model.dto.response.generic.Response;
import com.megapelis.api.model.enums.operation.ImageOperationEnum;
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum;
import com.megapelis.api.model.factory.DataFactory;
import com.megapelis.api.util.APICommon;

public class ImageFactory {
    public ImageFactory() {
    }

    public static <T> Response handler(DataFactory<T> data, ImageOperationEnum operation){
        APIController handler;
        switch (operation){
            case CREATE:
                handler = new CreateImageHandler();
                break;
            case FIND_ALL:
                handler = new FindAllImageHandler();
                break;
            case DELETE:
                handler = new DeleteImageHandler();
                break;
            case UPDATE:
                handler = new UpdateImageHandler();
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
