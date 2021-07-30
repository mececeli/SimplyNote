package com.ececeli.simplynote.data.note

data class Note(
    val id: Int,
    val title: String? = null,
    val details: String? = null,
    val date: Long = System.currentTimeMillis(),
    val location: String? = null
)