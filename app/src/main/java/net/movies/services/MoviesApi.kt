package net.movies.services

import net.movies.model.Movie
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://my-json-server.typicode.com/nikoloz14/movies-db/"

interface MoviesApi {

    @GET("db")
    fun getMovies() : Call<MovieListResponseDTO>

    companion object {
        operator fun invoke() : MoviesApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MoviesApi::class.java)
        }
    }
}

data class MovieListResponseDTO(
    val movies: List<Movie>
)