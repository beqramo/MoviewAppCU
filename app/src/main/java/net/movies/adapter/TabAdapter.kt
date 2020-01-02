package net.movies.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import net.movies.model.Movie
import net.movies.tabs.FirstFragment
import net.movies.tabs.SecondFragment

class MyPagerAdapter(fm: FragmentManager,val movie : Movie) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment(movie)
            }
            else -> {
                return SecondFragment(movie.cast)
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "INFO"
            else -> {
                return "CAST"
            }
        }
    }

}