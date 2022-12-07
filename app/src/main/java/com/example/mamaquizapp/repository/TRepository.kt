package com.example.mamaquizapp.repository

import androidx.lifecycle.LiveData
import com.example.mamaquizapp.QuizApplication
import com.example.mamaquizapp.data.model.*

class TRepository : TipsRepository {

    private val quizDao by lazy {

        QuizApplication.database.quizDao()
    }

    override suspend fun insertTips(tip1: TipsClass) {
        quizDao.insertTips(tip1)
    }

    //Read

    //get Tip 1
    private val getAllTip by lazy {
        quizDao.getTips()
    }
    override fun getTips(): LiveData<List<TipsClass>> {
       return getAllTip
    }

}