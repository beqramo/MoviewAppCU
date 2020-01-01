package net.movies.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.first_tab_fragment.*
import net.movies.R
import net.movies.model.Movie


class FirstFragment(val movie : Movie) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Glide.with(this)
            .load(movie.imageUrl)
            .into(movieImage)


        return inflater!!.inflate(R.layout.first_tab_fragment, container, false)
    }
}