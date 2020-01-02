package net.movies.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_movie.view.*
import net.movies.R
import net.movies.model.Movie
import net.movies.activty.MovieInfoTab
import java.io.Serializable

class MoviesAdapter(val movies : List<Movie>, val context: Context) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        return MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_movie, parent, false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        val index = position
        holder.view.itmMovieTitle.text = movie.title

        Glide.with(holder.view.context)
            .load(movie.imageUrl)
            .into(holder.view.itmMovieImage)

        holder.view.movieItemContainer.setOnClickListener{
            getMovieDetailsAndNavigate(index)
        }
    }


    private fun getMovieDetailsAndNavigate(it : Int ){
//        val builder = AlertDialog.Builder(context)
//        with(builder)
//        {
//            setTitle("Androidly Alert")
//            setMessage("We have a message ${movies[it] }")
//            show()
//        }
//        Log.d("movieass", it.toString())


        val intent = Intent(context, MovieInfoTab::class.java)
        intent.putExtra("movie", movies[it]  as Serializable)
        context.startActivity(intent)
    }


    class MovieViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}