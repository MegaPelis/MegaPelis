package com.megapelis.app.view

import androidx.fragment.app.Fragment
import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory

class ImageView : Fragment(){

//    fun execute(): FindAllImageRS {
//        val findAllImageRS: FindAllImageRS
//        val dataFactory : DataFactory<FindAllImageRS> = DataFactory(null, null, FindAllImageRS::class.java)
//        val response : Response =  MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_ALL)
//        findAllImageRS = response.data as FindAllImageRS;
//        return findAllImageRS
//    }
}