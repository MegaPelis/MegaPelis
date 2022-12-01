package com.megapelis.app.apdater

import com.megapelis.api.factory.ImageFactory
import com.megapelis.api.model.dto.request.body.image.FindAllImageRQ
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.ImageOperationEnum
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon

class ImageAdapter {

    companion object {
        fun execute(): FindAllImageRS {
            val findAllImageRQ = FindAllImageRQ()
            val dataFactory: DataFactory<FindAllImageRS> =
                DataFactory(
                    MegaPelisTypeServiceEnum.IMAGE,
                    findAllImageRQ,
                    FindAllImageRS::class.java
                )
            val response: Response = ImageFactory.handler(dataFactory, ImageOperationEnum.FIND_ALL)
            if(null == response.data){
                return FindAllImageRS()
            }else{
                return response.data as FindAllImageRS
            }
        }
    }
}