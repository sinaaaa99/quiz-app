package com.example.mamaquizapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mamaquizapp.data.model.Answers
import com.example.mamaquizapp.data.model.Questions

@Database(entities = [(Questions::class), (Answers::class)], version = 1)
abstract class QuizDatabase : RoomDatabase() {

    abstract fun quizDao(): QuizDao


}