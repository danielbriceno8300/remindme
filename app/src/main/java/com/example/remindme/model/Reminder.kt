package com.example.remindme.model

import java.util.Date

data class Reminder(
    val id: String = "",
    val title: String,
    val description: String?,
    val dateTime: Date,
    val isCompleted: Boolean = false,
    val icon: String? = null
)