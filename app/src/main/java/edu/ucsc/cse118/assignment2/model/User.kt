package edu.ucsc.cse118.assignment2.model

import kotlinx.serialization.Serializable
@Serializable
data class User (
    val name: String,
    val email: String,
)