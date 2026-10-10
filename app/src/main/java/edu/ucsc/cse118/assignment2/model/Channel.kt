package edu.ucsc.cse118.assignment2.model

import kotlinx.serialization.Serializable
@Serializable
data class Channel (
    val name: String,
    val messages: List<Message>
)