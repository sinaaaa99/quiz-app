package com.example.mamaquizapp.repository

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mamaquizapp.data.model.*

interface TipsRepository {


    //Insert
    suspend fun insertTips1(tip1: Tips1)

    suspend fun insertTips2(tip2: Tips2)

    suspend fun insertTips3(tip3: Tips3)

    suspend fun insertTips4(tip4: Tips4)

    suspend fun insertTips5(tip5: Tips5)

    suspend fun insertTips6(tip6: Tips6)

    //Read
    fun getTips1(): LiveData<List<Tips1>>

    fun getTips2(): LiveData<List<Tips2>>

    fun getTips3(): LiveData<List<Tips3>>

    fun getTips4(): LiveData<List<Tips4>>

    fun getTips5(): LiveData<List<Tips5>>

    fun getTips6(): LiveData<List<Tips6>>
}