package com.example.mamaquizapp.repository

import androidx.lifecycle.LiveData
import com.example.mamaquizapp.QuizApplication
import com.example.mamaquizapp.data.model.*

class TRepository : TipsRepository {

    private val quizDao by lazy {

        QuizApplication.database.quizDao()
    }

    override suspend fun insertTips1(tip1: Tips1) {
        quizDao.insertTips1(tip1)
    }

    override suspend fun insertTips2(tip2: Tips2) {
        quizDao.insertTips2(tip2)
    }

    override suspend fun insertTips3(tip3: Tips3) {
        quizDao.insertTips3(tip3)
    }

    override suspend fun insertTips4(tip4: Tips4) {
        quizDao.insertTips4(tip4)
    }

    override suspend fun insertTips5(tip5: Tips5) {
        quizDao.insertTips5(tip5)
    }

    override suspend fun insertTips6(tip6: Tips6) {
        quizDao.insertTips6(tip6)
    }


    //Read

    //get Tip 1
    private val getAllTip1 by lazy {
        quizDao.getTips1()
    }
    override fun getTips1(): LiveData<List<Tips1>> {
       return getAllTip1
    }


    //get Tip 2
    private val getAllTip2 by lazy {
        quizDao.getTips2()
    }
    override fun getTips2(): LiveData<List<Tips2>> {
        return getAllTip2
    }


    //get Tip 3
    private val getAllTip3 by lazy {
        quizDao.getTips3()
    }
    override fun getTips3(): LiveData<List<Tips3>> {
        return getAllTip3
    }


    //get Tip 4
    private val getAllTip4 by lazy {
        quizDao.getTips4()
    }
    override fun getTips4(): LiveData<List<Tips4>> {
        return getAllTip4
    }


    //get Tip 5
    private val getAllTip5 by lazy {
        quizDao.getTips5()
    }
    override fun getTips5(): LiveData<List<Tips5>> {
        return getAllTip5
    }


    //get Tip 6
    private val getAllTip6 by lazy {
        quizDao.getTips6()
    }
    override fun getTips6(): LiveData<List<Tips6>> {
        return getAllTip6
    }
}