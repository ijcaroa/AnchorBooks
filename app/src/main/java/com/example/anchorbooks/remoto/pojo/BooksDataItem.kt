package com.example.anchorbooks.remoto.pojo


import com.google.gson.annotations.SerializedName

data class BooksDataItem(
    @SerializedName("author")
    val author: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageLink")
    val imageLink: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("title")
    val title: String
)