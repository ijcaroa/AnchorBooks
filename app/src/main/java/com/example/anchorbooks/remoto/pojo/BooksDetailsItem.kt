package com.example.anchorbooks.remoto.pojo


import com.google.gson.annotations.SerializedName

data class BooksDetailsItem(
    @SerializedName("author")
    val author: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("delivery")
    val delivery: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageLink")
    val imageLink: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("lastPrice")
    val lastPrice: Int,
    @SerializedName("link")
    val link: String,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("price")
    val price: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("year")
    val year: Int
)