package com.megapelis.app.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.megapelis.R
import com.megapelis.app.activity.user.HomeUserActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var prueba : TextView = findViewById(R.id.prueba)

        prueba.setOnClickListener{
            var intent : Intent = Intent(this, HomeUserActivity::class.java)
            startActivity(intent)
        }
    }
}