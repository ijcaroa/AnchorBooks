package com.example.anchorbooks.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.anchorbooks.local.entity.BooksDetailsEntity
import com.example.anchorbooks.local.entity.BooksEntity


@Database(entities = [BooksEntity::class, BooksDetailsEntity::class], version = 1)
abstract class BooksDataBase : RoomDatabase(){

}