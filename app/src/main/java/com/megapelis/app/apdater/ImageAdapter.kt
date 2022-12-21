package com.megapelis.app.apdater

import android.content.SharedPreferences
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.app.controller.ImageController

class ImageAdapter(
    var sharedPreferences : SharedPreferences) {

    fun execute(): FindAllImageRS {
        val imageController : ImageController = ImageController(sharedPreferences)
        return imageController.findAll()
    }
}