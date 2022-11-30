package com.megapelis.app.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.megapelis.R
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.app.Prueba
import com.megapelis.app.activity.user.HomeUserActivity
import com.megapelis.app.apdater.ImageResponse
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        val prueba = Prueba()
        val findAllImageRS= prueba.findAllImageRS

        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(0).image)
            .centerCrop()
            .placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_1);


        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(1).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_8);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(2).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_2);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(3).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_3);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(4).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_4);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(5).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_5);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(6).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_6);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(7).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_7);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(8).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_9);
        Glide
            .with(this@MainActivity)
            .load(findAllImageRS.findAll.get(9).image)
            .centerCrop().placeholder(R.drawable.ic_image_home_1)
            .into(iv_view_image_home_10);

        val btn: Button = findViewById(R.id.button2)
        btn.setOnClickListener{
            val intent = Intent(this,HomeUserActivity::class.java)//Aqui coloco la actividad de pollo
            startActivity(intent)
        }



   }
}