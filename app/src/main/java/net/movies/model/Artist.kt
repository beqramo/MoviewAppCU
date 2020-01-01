package net.movies.model

import java.io.Serializable

data class Artist(
    val id: String,
    val fullName: String,
    val role: String,
    val imageUrl: String
): Serializable