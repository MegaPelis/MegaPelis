package com.megapelis.api.retrofit.utlis

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.google.gson.Gson

class SharedPref(activity: Activity) {

    private  var pref: SharedPreferences? = null;

    init {
        pref = activity.getSharedPreferences("com.megapelis", Context.MODE_PRIVATE);
    }

    fun save(key: String, objeto : Any){
        try {
            val gson = Gson();
            val json = gson.toJson(objeto);
            with(pref?.edit()){
                this?.putString(key, json);
                this?.commit()
            }

        }catch (e: Exception){
        Log.d("Login", "Error ${e.message}")
        }
    }

    fun getData(key : String): String? {
        val data = pref?.getString(key, "")
        return data;
    }
}