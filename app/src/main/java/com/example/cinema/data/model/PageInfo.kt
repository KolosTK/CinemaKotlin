package com.example.cinema.data.model

data class PageInfo(
    val __typename: String,
    val endCursor: String,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val startCursor: String
)