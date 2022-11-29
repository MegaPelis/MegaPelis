package com.megapelis.app.activity

import android.content.Intent
import android.os.Bundle
import android.util.Base64
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.megapelis.R
import com.megapelis.api.factory.ImageFactory
import com.megapelis.api.model.dto.request.body.image.FindAllImageRQ
import com.megapelis.api.model.dto.response.body.image.FindAllImageRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.ImageOperationEnum
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.app.Prueba
import com.megapelis.app.activity.user.HomeUserActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        val findAllImageRQ= FindAllImageRQ()




        val findAllImageRS: FindAllImageRS
        val dataFactory : DataFactory<FindAllImageRS> = DataFactory(null, findAllImageRQ, FindAllImageRS::class.java)
        val response : Response =  ImageFactory.handler(dataFactory, ImageOperationEnum.FIND_ALL)
        findAllImageRS = response.data as FindAllImageRS;

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