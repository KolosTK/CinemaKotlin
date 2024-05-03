package com.example.cinema.data.model

data class AwardedEntities(
    val __typename: String,
    val awardTitles: List<AwardTitle>,
    val secondaryAwardCompanies: Any,
    val secondaryAwardNames: List<SecondaryAwardName>
)