package com.example.mamaquizapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mamaquizapp.data.model.*

@Database(
    entities = [
        (Questions::class),
        (Answers::class),
        (SuggestionType1::class),
        (SuggestionType2::class),
        (SuggestionType3::class),
        (SuggestionType4::class),
        (SuggestionType5::class),
        (SuggestionType6::class)
    ],
    version = 1
)
abstract class QuizDatabase : RoomDatabase() {

    abstract fun quizDao(): QuizDao


}