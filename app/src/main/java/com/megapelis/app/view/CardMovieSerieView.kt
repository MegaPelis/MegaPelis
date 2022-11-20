package com.megapelis.app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.megapelis.R

import com.megapelis.api.factory.MovieSerieFactory
import com.megapelis.api.model.dto.response.body.movieserie.FindAllMovieSerieRS
import com.megapelis.api.model.dto.response.generic.Response
import com.megapelis.api.model.enums.MegaPelisTypeServiceEnum
import com.megapelis.api.model.enums.MovieSerieOperationEnum
import com.megapelis.api.model.factory.DataFactory
import com.megapelis.app.apdater.CardMovieSerieAdapter

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CardMovieSerieView : Fragment() {

    lateinit var containerCards: RecyclerView
    lateinit var cardMovieSerieAdapter: CardMovieSerieAdapter

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val linearLayout = LinearLayoutManager(context)
        linearLayout.orientation = LinearLayoutManager.VERTICAL

        val view = inflater.inflate(R.layout.fragment_cards_movie_serie, container, false)

        cardMovieSerieAdapter = CardMovieSerieAdapter(context, execute(), R.id.card_serie_image)

        containerCards = view.findViewById(R.id.container_card_serie_image)
        containerCards.layoutManager = linearLayout
        containerCards.adapter = cardMovieSerieAdapter
        return view
    }

    fun execute(): FindAllMovieSerieRS {
        val findAllMovieSerieRS: FindAllMovieSerieRS
        val dataFactory : DataFactory<FindAllMovieSerieRS> = DataFactory(MegaPelisTypeServiceEnum.MOVIE, null, FindAllMovieSerieRS::class.java)
        val response : Response =  MovieSerieFactory.handler(dataFactory, MovieSerieOperationEnum.FIND_ALL)
        findAllMovieSerieRS = response.data as FindAllMovieSerieRS;
        return findAllMovieSerieRS
    }
}

