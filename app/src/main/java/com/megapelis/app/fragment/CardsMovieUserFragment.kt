package com.megapelis.app.fragment

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.megapelis.R
import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.operation.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.operation.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.api.util.APIConstant
import com.megapelis.app.apdater.CardMovieSerieUserAdapter
import com.megapelis.app.controller.MovieSerieController

class CardsMovieUserFragment : Fragment() {

    lateinit var containerCards: RecyclerView
    lateinit var cardMovieAdapter: CardMovieSerieUserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cards_movie_user, container, false)

        cardMovieAdapter = CardMovieSerieUserAdapter(context, execute(), R.id.card_serie_image)

        containerCards = view.findViewById(R.id.fragment_cards_movie_container)
        containerCards.layoutManager = GridLayoutManager(context, 2)
        containerCards.adapter = cardMovieAdapter
        return view
    }

    fun execute(): FindAllMovieSerieRS {
        if(this.activity == null){
            return FindAllMovieSerieRS()
        }
        val sharedPreferences : SharedPreferences =  this.requireActivity()
            .getSharedPreferences(APIConstant.STRING_SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val controller : MovieSerieController = MovieSerieController(sharedPreferences, MegaPelisTypeServiceEnum.MOVIE)
        return controller.findAll()
    }
}