package com.example.anchorbooks.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull


@Entity(tableName = "books_table")
data class BooksEntity(
    @PrimaryKey
    @NotNull
    val id: Int,
    val title: String,
    val author: String,
    val country: String,
    val imageLink: String,
    val language: String,
    val fav: Boolean = false)










