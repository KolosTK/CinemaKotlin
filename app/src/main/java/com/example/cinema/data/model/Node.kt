package com.example.cinema.data.model

data class Node(
    val __typename: String,
    val award: Award,
    val awardedEntities: AwardedEntities,
    val category: CategoryX,
    val forEpisodes: Any,
    val forSongTitles: List<String>,
    val id: String,
    val isWinner: Boolean,
    val notes: Notes,
    val winningRank: Int
)