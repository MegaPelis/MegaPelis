package com.megapelis.app.activity.user

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.megapelis.R

class HomeUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_user)

        var cardMovieTitle : TextView = findViewById(R.id.home_user_card_movie_title)
        var cardSerieTitle : TextView = findViewById(R.id.home_user_card_serie_title)

        cardMovieTitle.setOnClickListener {
            var intent : Intent = Intent(this, MoviesUserActivity::class.java)
            startActivity(intent)
        }

        cardSerieTitle.setOnClickListener {
            var intent : Intent = Intent(this, SeriesUserActivity::class.java)
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