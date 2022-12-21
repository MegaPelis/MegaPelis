package com.megapelis.app.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.megapelis.R
import com.megapelis.api.util.APIConstant
import com.megapelis.app.activity.user.LoginUser
import com.megapelis.app.activity.user.RegisterUser
import com.megapelis.app.apdater.ImageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadImage()
        loadButton()
   }

    override fun onStart(){
        super.onStart();
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun loadImage(){
        val sharedPreferences : SharedPreferences = getSharedPreferences(APIConstant.STRING_SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val imageAdapter : ImageAdapter = ImageAdapter(sharedPreferences)
        val findAllImageRS = imageAdapter.execute()
        if(null != findAllImageRS.findAll && findAllImageRS.findAll.isNotEmpty()){
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[0].image)
                .centerCrop()
                .placeholder(R.drawable.movie_01)
                .into(iv_view_image_home_1);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[1].image)
                .centerCrop().placeholder(R.drawable.movie_02)
                .into(iv_view_image_home_8);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[2].image)
                .centerCrop().placeholder(R.drawable.movie_03)
                .into(iv_view_image_home_2);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[3].image)
                .centerCrop().placeholder(R.drawable.movie_04)
                .into(iv_view_image_home_3);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[4].image)
                .centerCrop().placeholder(R.drawable.movie_05)
                .into(iv_view_image_home_4);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[5].image)
                .centerCrop().placeholder(R.drawable.movie_06)
                .into(iv_view_image_home_5);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[6].image)
                .centerCrop().placeholder(R.drawable.serie_01)
                .into(iv_view_image_home_6);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[7].image)
                .centerCrop().placeholder(R.drawable.serie_02)
                .into(iv_view_image_home_7);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[8].image)
                .centerCrop().placeholder(R.drawable.serie_03)
                .into(iv_view_image_home_9);
            Glide
                .with(this@MainActivity)
                .load(findAllImageRS.findAll[9].image)
                .centerCrop().placeholder(R.drawable.serie_04)
                .into(iv_view_image_home_10);
        }
    }

    private fun loadButton(){
        val buttonLogin: Button = findViewById(R.id.button2)
        buttonLogin.setOnClickListener{
            val intent = Intent(this, LoginUser::class.java)
            startActivity(intent)
        }

        val buttonRegister: Button = findViewById(R.id.button)
        buttonRegister.setOnClickListener{
            val intent = Intent(this, RegisterUser::class.java)
            startActivity(intent)
        }
    }
}