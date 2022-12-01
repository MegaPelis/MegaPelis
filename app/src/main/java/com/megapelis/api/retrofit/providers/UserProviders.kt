package com.megapelis.api.retrofit.providers

import com.megapelis.api.retrofit.api.ApiRoutes
import com.megapelis.api.retrofit.http.ResponseLogin
import com.megapelis.api.retrofit.http.ResponseUser
import com.megapelis.api.retrofit.model.Login
import com.megapelis.api.retrofit.model.User
import com.megapelis.api.retrofit.routes.UserRoutes
import retrofit2.Call

class UserProviders {
    private var userRoutes : UserRoutes? = null;

    init {
        val api = ApiRoutes();
        userRoutes = api.getUserRoutes()
    }

    fun register(user: User): Call<ResponseUser>? {
        return userRoutes?.register(user);
    }

    fun login(login: Login): Call<ResponseLogin>?{
        return userRoutes?.login(login);
    }

}