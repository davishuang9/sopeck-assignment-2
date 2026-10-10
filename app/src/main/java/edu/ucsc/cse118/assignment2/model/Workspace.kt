package edu.ucsc.cse118.assignment2.model

import kotlinx.serialization.Serializable

@Serializable
data class Workspace(
    val name: String,
    val channels: List<Channel>
)