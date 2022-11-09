package com.example.mamaquizapp

import android.app.Application
import androidx.room.Room
import com.example.mamaquizapp.data.db.QuizDatabase

class QuizApplication : Application() {

    private val databaseName = "Question_DB"

    companion object {

        lateinit var database: QuizDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            this,
            QuizDatabase::class.java,
            databaseName
        ).build()
    }

}