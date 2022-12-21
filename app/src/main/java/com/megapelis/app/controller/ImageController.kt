package com.megapelis.app.controller

import android.content.SharedPreferences
import com.megapelis.api.factory.ImageFactory
import com.megapelis.api.model.dto.request.body.image.FindAllImageRQ
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.ImageOperationEnum
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon
import com.megapelis.api.util.APIConstant

class ImageController(
    var sharedPreferences : SharedPreferences) {

    fun findAll() : FindAllImageRS {
        val responseCache = sharedPreferences.getString(APIConstant.STRING_SHARED_PREFERENCES_DATA_IMAGE_FIND_ALL, null)
        val data : FindAllImageRS
        if(!APICommon.isValidString(responseCache)){
            val sharedPreferencesEdit : SharedPreferences.Editor = sharedPreferences.edit()
            var response: Response = ImageFactory.handler(
                DataFactory(
                    MegaPelisTypeServiceEnum.IMAGE,
                    FindAllImageRQ(),
                    FindAllImageRS::class.java
                ),
                ImageOperationEnum.FIND_ALL
            )
            if(null == response.data){
                return FindAllImageRS()
            }else{
                data = response.data as FindAllImageRS
                sharedPreferencesEdit.putString(APIConstant.STRING_SHARED_PREFERENCES_DATA_IMAGE_FIND_ALL, APICommon.getStringJSON(data))
                sharedPreferencesEdit.commit()
            }
        }else {
            data = APICommon.convertObjectToClass(responseCache, FindAllImageRS::class.java)
        }
        return data
    }
}