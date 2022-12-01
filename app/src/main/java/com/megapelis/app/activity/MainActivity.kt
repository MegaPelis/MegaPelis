package com.megapelis.app.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.megapelis.R
import com.megapelis.app.activity.user.HomeUserActivity
import com.megapelis.app.apdater.ImageAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findAllImageRS = ImageAdapter.execute()

        if(null != findAllImageRS.findAll && !findAllImageRS.findAll.isEmpty()){
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

        val btn1: Button = findViewById(R.id.button2)
        btn1.setBackgroundColor(Color.parseColor("#39008e"))
        btn1.setOnClickListener{
            val intent = Intent(this,HomeUserActivity::class.java)//Aqui coloco la actividad de pollo
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button)
        btn2.setOnClickListener{
            val intent = Intent(this,HomeUserActivity::class.java)//Aqui coloco la actividad de pollo
            startActivity(intent)
        }
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
}