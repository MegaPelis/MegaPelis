package com.megapelis.api.retrofit.http

import com.google.gson.annotations.SerializedName
import com.megapelis.api.retrofit.model.User

class ResponseLogin (
    @SerializedName("user") val user: User?,
    @SerializedName("token") val token: String
    ){

}