package com.megapelis.api.retrofit.model

import com.google.gson.annotations.SerializedName

class User(
    @SerializedName("id") val id: String? = null,
    @SerializedName("nombre") val nombre: String,
    @SerializedName("apellido") val apellido: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("rol") val rol: String,
    @SerializedName("google") val google: Boolean? = null,
    @SerializedName("estado") val estado: Boolean? = null) {


    override fun toString(): String {
        return "UserModel(id='$id', nombre='$nombre', apellido='$apellido', email='$email', password='$password', rol='$rol', google=$google, estado=$estado)"
    }
}