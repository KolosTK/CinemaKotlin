package com.example.cinema.data.model

data class TitleType(
    val __typename: String,
    val canHaveEpisodes: Boolean,
    val categories: List<Category>,
    val displayableProperty: DisplayablePropertyXX,
    val id: String,
    val isEpisode: Boolean,
    val isSeries: Boolean,
    val text: String
)