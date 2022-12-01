package com.megapelis.api.retrofit.api


import com.megapelis.api.retrofit.routes.UserRoutes

class ApiRoutes {
    val api_url= "https://240kdcqkd8.execute-api.us-east-1.amazonaws.com/dev/"
    val retrofit =  RetrofitClient();

    fun getUserRoutes(): UserRoutes{
    return  retrofit.getClient(api_url).create(UserRoutes::class.java)
    }

}