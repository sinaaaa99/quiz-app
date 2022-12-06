package com.example.mamaquizapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mamaquizapp.data.model.*

@Database(
    entities = [
        (Questions::class),
        (Answers::class),
        (Tips1::class),
        (Tips2::class),
        (Tips3::class),
        (Tips4::class),
        (Tips5::class),
        (Tips6::class)
    ],
    version = 1
)
abstract class QuizDatabase : RoomDatabase() {

    abstract fun quizDao(): QuizDao


}