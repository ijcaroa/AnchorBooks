package com.example.anchorbooks.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.NotNull

@Entity(tableName = "booksDetails_Table")
data class BooksDetailsEntity(
    @PrimaryKey
    @NotNull
    val id: Int,
    val title: String,
    val author: String,
    val country: String,
    val delivery: Boolean,
    val imageLink: String,
    val language: String,
    val lastPrice: Int,
    val link: String,
    val pages: Int,
    val price: Int,
    val year: Int

)
