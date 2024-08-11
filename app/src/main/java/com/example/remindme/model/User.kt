package com.example.remindme.model

data class User(
    val id: String = "",          // Unique identifier for the user
    val name: String,             // Name of the user
    val email: String,            // Email address of the user
    val profilePictureUrl: String? = null  // Optional profile picture URL
)