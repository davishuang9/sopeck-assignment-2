package edu.ucsc.cse118.assignment2.model

import kotlinx.serialization.Serializable

@Serializable
data class Message (
    val user: User,
    val date: String,
    val content: String,
)