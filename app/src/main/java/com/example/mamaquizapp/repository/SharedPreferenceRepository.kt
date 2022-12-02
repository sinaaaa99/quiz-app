package com.example.mamaquizapp.repository

import android.content.Context

const val sharedName = "shared_preference"

class SharedPreferenceRepository(context: Context) {


    private val sharedPref = context.getSharedPreferences(sharedName, Context.MODE_PRIVATE)


    //change navigate for scenario 1
    fun isFinished1() = sharedPref.edit().apply {

        putBoolean("isFinished1", true)
        apply()
    }

    val readData1 = sharedPref.getBoolean("isFinished1", false)


    //change navigate for scenario 2
    fun isFinished2() = sharedPref.edit().apply {

        putBoolean("isFinished2", true)
        apply()
    }

    val readData2 = sharedPref.getBoolean("isFinished2", false)


    //change navigate for scenario 3
    fun isFinished3() = sharedPref.edit().apply {

        putBoolean("isFinished3", true)
        apply()
    }

    val readData3 = sharedPref.getBoolean("isFinished3", false)


    //change navigate for scenario 4
    fun isFinished4() = sharedPref.edit().apply {

        putBoolean("isFinished4", true)
        apply()
    }

    val readData4 = sharedPref.getBoolean("isFinished4", false)


    //change navigate for scenario 5
    fun isFinished5() = sharedPref.edit().apply {

        putBoolean("isFinished5", true)
        apply()
    }

    val readData5 = sharedPref.getBoolean("isFinished5", false)


    //change navigate for scenario 6
    fun isFinished6() = sharedPref.edit().apply {

        putBoolean("isFinished6", true)
        apply()
    }

    val readData6 = sharedPref.getBoolean("isFinished6", false)

    //change navigate for scenario 7
    fun isFinished7() = sharedPref.edit().apply {

        putBoolean("isFinished7", true)
        apply()
    }

    val readData7 = sharedPref.getBoolean("isFinished7", false)
}