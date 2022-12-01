package com.megapelis.api.retrofit.routes

import com.megapelis.api.retrofit.http.ResponseLogin
import com.megapelis.api.retrofit.http.ResponseUser
import com.megapelis.api.retrofit.model.Login
import com.megapelis.api.retrofit.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface UserRoutes {
    @POST("usuario")
    fun register(@Body user : User):Call<ResponseUser>


    @POST("auth/login")
    fun login(@Body login: Login): Call<ResponseLogin>

}