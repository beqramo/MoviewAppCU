package net.movies.tabs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.second_tab_fragment.*
import net.movies.R
import net.movies.adapter.ActorsAdapter
import net.movies.model.Artist


class SecondFragment(val cast : List<Artist>) : Fragment() {


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.second_tab_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showActor(cast)

    }

    private fun showActor(actors: List<Artist>) {
        recyclerViewActors.layoutManager = LinearLayoutManager(this)
        recyclerViewActors.adapter =
            ActorsAdapter(actors, this)
    }
}// Required empty public constructor
