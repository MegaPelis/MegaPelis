package com.megapelis.api.retrofit.model.activity.user

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.megapelis.R
import com.megapelis.api.retrofit.http.ResponseUser
import com.megapelis.api.retrofit.model.User
import com.megapelis.api.retrofit.providers.UserProviders
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterUser : AppCompatActivity() {
    var imageViewGoToLogin: ImageView? = null
    var editTextNombre : EditText?= null
    var editTextApellido: EditText? = null
    var editTextEmail: EditText? = null
    var editTextPass: EditText? = null
    var btnGuardar: Button? = null
    var userProviders = UserProviders()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)
        imageViewGoToLogin = findViewById(R.id.go_View_to_login);
        editTextNombre = findViewById(R.id.edit_text_nombre);
        editTextApellido = findViewById(R.id.edit_text_apellido);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextPass = findViewById(R.id.edit_text_pass);
        btnGuardar = findViewById(R.id.btn_guardar)
        imageViewGoToLogin?.setOnClickListener{ goToLogin() }
        btnGuardar?.setOnClickListener{ registrar()}
    }

    private  fun goToLogin(){
    val i = Intent(this, LoginUser::class.java)
    startActivity(i)
    }

    private fun registrar(){
        val nombre = editTextNombre?.text.toString()
        val apellido = editTextApellido?.text.toString()
        val email = editTextEmail?.text.toString()
        val pass = editTextPass?.text.toString()
        if (validarFormulario(email,pass,nombre,apellido)){
            var user = User(null,nombre,apellido,email,pass,  "USER_ROLE", null,null );
            userProviders.register(user)?.enqueue(object: Callback<ResponseUser>{
                override fun onResponse(call: Call<ResponseUser>, response: Response<ResponseUser>
                ) {   Log.d(TAG, "body: ${response.body()?.uid}")
                }
                override fun onFailure(call: Call<ResponseUser>, t: Throwable) {
                   Log.d(TAG, "se produjo un error ${t.message}")
                }
            })
        }else{
            Toast.makeText(this, "el Formulario es invalido", Toast.LENGTH_LONG).show()
        }

    }

    fun String.isEmailValid():Boolean{
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

    private fun validarFormulario(email: String, pass: String, nombre: String, apellido: String): Boolean{
        if(email.isBlank() || pass.isBlank() || nombre.isBlank() || apellido.isBlank()){
            return false
        }
        if (!email.isEmailValid()){
            return false
        }
        return true
    }

}