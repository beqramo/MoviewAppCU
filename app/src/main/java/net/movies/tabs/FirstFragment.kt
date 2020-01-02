package net.movies.tabs

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.first_tab_fragment.*
import kotlinx.android.synthetic.main.first_tab_fragment.view.*
import net.movies.R
import net.movies.model.Movie


class FirstFragment(val movie : Movie) : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater!!.inflate(R.layout.first_tab_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.movieTitlee.text  = movie.title
        view.language.text  = movie.language
        view.releaseDate.text  = movie.date
        view.season.text  = movie.seasons.toString()

        Glide.with(this)
            .load(movie.imageUrl)
            .into(view.imageView)

    }
}