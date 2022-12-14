package com.megapelis.app.fragment

import androidx.fragment.app.Fragment
import com.megapelis.api.factory.ImageFactory
import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.request.body.image.FindAllImageRQ
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.ImageOperationEnum
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APICommon

class ImageView : Fragment() {

    fun execute(): FindAllImageRS {
        val findAllImageRQ = FindAllImageRQ()
        val findAllImageRS: FindAllImageRS
        val dataFactory: DataFactory<FindAllImageRS> =
            DataFactory(MegaPelisTypeServiceEnum.IMAGE, findAllImageRQ, FindAllImageRS::class.java)
        val response: Response = ImageFactory.handler(dataFactory, ImageOperationEnum.FIND_ALL)
        APICommon.output(response)
        findAllImageRS = response.data as FindAllImageRS;
        return findAllImageRS
    }
}