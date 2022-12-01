package com.megapelis.api.retrofit.model

import com.google.gson.annotations.SerializedName

data class Login(
    @SerializedName("email") val email: String? = null,
    @SerializedName("password") val password: String,){
    override fun toString(): String {
        return "Login(email=$email, password='$password')"
    }
}
