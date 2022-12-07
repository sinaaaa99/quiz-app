package com.example.mamaquizapp.repository

import androidx.lifecycle.LiveData
import com.example.mamaquizapp.data.model.*

interface TipsRepository {


    //Insert
    suspend fun insertTips(tip1: TipsClass)


    //Read
    fun getTips(): LiveData<List<TipsClass>>

}