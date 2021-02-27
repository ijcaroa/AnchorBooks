package com.example.anchorbooks.remoto

import com.example.anchorbooks.remoto.pojo.BooksDataItem
import com.example.anchorbooks.remoto.pojo.BooksDetailsItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface APIInterface {

    @GET("books")
    suspend fun fetchBooksList():
            Response<List<BooksDataItem>>

    @GET("bookDetail/{idLibro}")
    suspend fun fetchDetailsBook(@Path("idLibro")idLibro:Int):
            Response<BooksDetailsItem>
}