package net.movies.screen


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.movies.R
import net.movies.model.Movie


class MovieInfoTab : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movies_info_tabs)

        val movie = intent.getStringExtra("movie") as Movie

//        Log.d("movieas",movie )

//        val fragmentAdapter = MyPagerAdapter(supportFragmentManager, movie)
//        viewpager_main.adapter = fragmentAdapter
//
//        tabs_main.setupWithViewPager(viewpager_main)



    }
}

