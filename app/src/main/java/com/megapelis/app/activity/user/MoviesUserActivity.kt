package com.megapelis.app.activity.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import com.megapelis.R

class MoviesUserActivity : AppCompatActivity() {

    lateinit var loader: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loader = findViewById(R.id.movies_user_loader)
        loader.visibility = View.VISIBLE
        setContentView(R.layout.activity_movies_user)
        loader.visibility = View.GONE
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