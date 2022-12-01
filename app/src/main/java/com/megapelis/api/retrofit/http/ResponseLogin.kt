package com.megapelis.api.retrofit.http

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

class ResponseLogin (
    @SerializedName("user") val user: JsonObject,
    @SerializedName("token") val token: String,
    @SerializedName("msg") val msg:  String,
    @SerializedName("errors") val error : JsonObject
    ){
    override fun toString(): String {
        return "ResponseLogin(user=$user, token='$token')"
    }
}