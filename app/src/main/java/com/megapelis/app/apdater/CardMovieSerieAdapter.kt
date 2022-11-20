package com.megapelis.app.apdater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.megapelis.R
import com.megapelis.api.model.dto.request.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.request.response.body.movieserie.FindByIdMovieSerieRS
import com.squareup.picasso.Picasso

/**
 * Clase {@link CardMovieSerieAdapter}
 * @author sergio.barrios.
 */
class CardMovieSerieAdapter(
    var context : Context?,
    val data: FindAllMovieSerieRS, recurso: Int):
    Adapter<CardMovieSerieAdapter.CardMovieSerieHolder>() {

    class CardMovieSerieHolder(view: View) : RecyclerView.ViewHolder(view){
        var titleMovieSerie: TextView
        var imageMovieSerie: ImageView
        init {
            titleMovieSerie = view.findViewById(R.id.card_movie_serie_title)
            imageMovieSerie = view.findViewById(R.id.card_movie_serie_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardMovieSerieHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val view: View = layoutinflater.inflate(R.layout.layout_card_movie_serie, parent, false)
        return CardMovieSerieHolder(view)
    }

    override fun onBindViewHolder(holder: CardMovieSerieHolder, position: Int) {
        var movieSerie: FindByIdMovieSerieRS = data.findAll.get(position);
        holder.titleMovieSerie.setText(movieSerie.name)
        Picasso.get().load(movieSerie.image).into(holder.imageMovieSerie);
    }

    override fun getItemCount(): Int {
        return data.findAll.size
    }
}