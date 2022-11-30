package com.megapelis.api.activity.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.megapelis.R
import com.megapelis.api.retrofit.http.ResponseLogin
import com.megapelis.api.retrofit.http.ResponseUser
import com.megapelis.api.retrofit.providers.UserProviders
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginUser : AppCompatActivity() {
    var imageViewGoToRegister: ImageView? = null
    var editTextEmail: EditText? = null
    var editTextPass: EditText? = null
    var btnLogin: Button? = null
    var userProviders = UserProviders()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)
        imageViewGoToRegister= findViewById(R.id.right_img);
        editTextEmail = findViewById(R.id.email)
        editTextPass = findViewById(R.id.pass)
        btnLogin = findViewById(R.id.btn_login)
        imageViewGoToRegister?.setOnClickListener{ goToRegister()};
        btnLogin?.setOnClickListener{ login() }
    }

    private fun goToRegister(){
        val i = Intent(this, RegisterUser::class.java)
        startActivity(i);
    }

    private fun login(){
        val email = editTextEmail?.text.toString()
        val pass = editTextPass?.text.toString()
        if(validarFormulario(email, pass)){
         userProviders.login(email,pass)?.enqueue(object : Callback<ResponseLogin>{
             override fun onResponse(call: Call<ResponseLogin>, response: Response<ResponseLogin>) {
                 Log.d("MainActivity","body: ${response.body()?.token}")
             }

             override fun onFailure(call: Call<ResponseLogin>, t: Throwable) {
                 Log.d("MainActivity","Todo mal: ${t.message}")
             }


         })
        }else{
            Toast.makeText(this, "El formulario es invalido", Toast.LENGTH_LONG).show()
        }

        //Print en Vista
        //Toast.makeText(this, "Email es : ${email}", Toast.LENGTH_LONG).show()
        //Toast.makeText(this, "Password es : ${pass}", Toast.LENGTH_LONG).show()
        //Console.log()
        // Log.d("MainActivity","El email es ${email}")
        // Log.d("MainActivity","El Password es ${pass}")
    }



    fun String.isEmailValid():Boolean{
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

    private fun validarFormulario(email: String, pass: String): Boolean{
        if(email.isBlank() || pass.isBlank()){
            return false
        }
        if (!email.isEmailValid()){
            return false
        }
        return true
    }
}