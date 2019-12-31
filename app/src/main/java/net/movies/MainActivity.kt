package net.movies

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        refreshLayout.setOnRefreshListener {
            fetchMovies()
        }

        fetchMovies()

//        CardView.

    }

    private fun fetchMovies(){
        refreshLayout.isRefreshing = true

        MoviesApi().getMovies().enqueue(object : Callback<MovieListResponseDTO> {
            override fun onFailure(call: Call<MovieListResponseDTO>, t: Throwable) {
                refreshLayout.isRefreshing = false
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<MovieListResponseDTO>, response: Response<MovieListResponseDTO>) {
//                Toast.makeText(applicationContext,response.body().toString(), Toast.LENGTH_LONG).show()

                refreshLayout.isRefreshing = false
                val movies = response.body()

                movies?.let {
                    showMovies(it.movies)
                }

            }
        })
    }

    private fun showMovies(movies: List<Movie>) {
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.adapter = MoviesAdapter(movies, this)
    }
}
