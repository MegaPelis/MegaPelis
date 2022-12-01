package com.megapelis.api.retrofit.http

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

class ResponseUser(

   @SerializedName("nombre") val nombre: String,
    @SerializedName ("apellido")val apellido: String,
    @SerializedName("email") val email:  String,
    @SerializedName("rol") val rol:String,
    @SerializedName("google") val google:Boolean,
    @SerializedName("estado") val estado: Boolean,
    @SerializedName("uid") val uid: String,
   @SerializedName("errors") val errors: JsonObject
) {
}