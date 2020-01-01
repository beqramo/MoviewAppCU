package net.movies.model

import java.io.Serializable


data class Movie (
    val id: String,
    val title: String,
    val date: String,
    val language: String,
    val imageUrl: String,
    val cast: List<Artist>
) : Serializable