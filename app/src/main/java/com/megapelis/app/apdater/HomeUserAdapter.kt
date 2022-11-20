package com.megapelis.app.apdater

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.megapelis.app.view.CardMovieSerieView

class HomeUserAdapter(
    var context: Context,
    fm: FragmentManager,
    val totalTabs: Int): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> {
                CardMovieSerieView()
            }
            else -> getItem(position)
        }

    }
}