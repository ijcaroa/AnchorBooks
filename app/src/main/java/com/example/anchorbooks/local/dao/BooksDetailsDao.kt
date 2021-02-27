package com.example.anchorbooks.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.anchorbooks.local.entity.BooksDetailsEntity

@Dao
interface BooksDetailsDao {

@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun insertDetailsBook (detailsBooks : BooksDetailsEntity)

@Insert (onConflict = OnConflictStrategy.REPLACE)
suspend fun insertAllDetailsBook(listDetailsBooks : List<BooksDetailsEntity>)

@Query("SELECT * FROM booksDetails_Table ORDER BY id DESC")
fun getAllDetails(): LiveData<List<BooksDetailsEntity>>

@Query("SELECT * FROM   booksDetails_Table WHERE id = :id")
fun getBookById (id: Int) : LiveData<BooksDetailsEntity>



}