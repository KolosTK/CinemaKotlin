package com.example.cinema.data.model

data class EventEdition(
    val event: Event,
    val id: String,
    val instanceWithinYear: Int,
    val year: Int
)