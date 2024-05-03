package com.example.cinema.data.model

data class ReleaseDate(
    val __typename: String,
    val attributes: List<Any>,
    val country: Country,
    val day: Int,
    val displayableProperty: DisplayablePropertyX,
    val month: Int,
    val restriction: Any,
    val year: Int
)