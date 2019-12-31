package net.movies


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.movies_info_tabs.*


class MovieInfoTab : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movies_info_tabs)

        val movie = intent.getStringExtra("movie") as Movie



        val fragmentAdapter = MyPagerAdapter(supportFragmentManager, movie)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)



    }
}

