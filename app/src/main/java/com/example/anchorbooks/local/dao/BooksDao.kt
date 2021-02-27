package com.example.anchorbooks.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.anchorbooks.local.entity.BooksEntity

@Dao
interface BooksDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllBooks(bookList: List<BooksEntity>)

    @Update
    suspend fun updateFavImages(booksEntity: BooksEntity)

    @Query("SELECT * FROM books_table ORDER BY title ASC")
    fun getAllBooksList(): LiveData<List<BooksEntity>>

    @Query("SELECT * FROM books_table WHERE fav = 1")
    fun getAllFavBooks(): LiveData<List<BooksEntity>>
}