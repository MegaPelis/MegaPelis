package com.megapelis.app.controller

import android.content.SharedPreferences
import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon
import com.megapelis.api.util.APIConstant

class MovieSerieController(
    var sharedPreferences : SharedPreferences,
    var type: MegaPelisTypeServiceEnum) {

    fun findAll() : FindAllMovieSerieRS {
        val cache = if(type == MegaPelisTypeServiceEnum.SERIE){
            APIConstant.STRING_SHARED_PREFERENCES_DATA_SERIE_FIND_ALL
        }else{
            APIConstant.STRING_SHARED_PREFERENCES_DATA_MOVIE_FIND_ALL
        }
        val data : FindAllMovieSerieRS
        val responseCache = sharedPreferences.getString(cache, null)
        if(!APICommon.isValidString(responseCache)){
            val sharedPreferencesEdit : SharedPreferences.Editor = sharedPreferences.edit()
            var response: Response = MovieSerieFactory.handler(
                DataFactory(
                    type,
                    null,
                    FindAllMovieSerieRS::class.java
                ),
                MovieSerieOperationEnum.FIND_ALL
            )
            if(null == response.data){
                return FindAllMovieSerieRS()
            }else{
                data = response.data as FindAllMovieSerieRS
                sharedPreferencesEdit.putString(APIConstant.STRING_SHARED_PREFERENCES_DATA_IMAGE_FIND_ALL, APICommon.getStringJSON(data))
                sharedPreferencesEdit.commit()
            }
        }else{
            data = APICommon.convertObjectToClass(responseCache, FindAllMovieSerieRS::class.java)
        }
        return data
    }
}