package com.example.mamaquizapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mamaquizapp.data.model.*

@Dao
interface QuizDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertQuestion(question: Questions)


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAnswers(answer: Answers)


    @Query("select * from questions order by question_id")
    fun getAllQuestion(): LiveData<List<Questions>>


    @Query("select * from questions")
    fun getAllQuestionsAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>>


    //update Answers
    @Query("update questions set isAnswered = :isAnswerd , answerState=:answerStatee where question_id=:id")
    suspend fun updateQuestionState(isAnswerd: Boolean, answerStatee: Boolean, id: Int)


    //tipsScreen

    //Insert
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTips1(tip1: Tips1)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTips2(tip2: Tips2)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTips3(tip3: Tips3)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTips4(tip4: Tips4)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTips5(tip5: Tips5)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTips6(tip6: Tips6)

    //Read
    @Query("select * from Tips1 order by id")
    fun getTips1(): LiveData<List<Tips1>>

    @Query("select * from Tips2 order by id")
    fun getTips2(): LiveData<List<Tips2>>

    @Query("select * from Tips3 order by id")
    fun getTips3(): LiveData<List<Tips3>>

    @Query("select * from Tips4 order by id")
    fun getTips4(): LiveData<List<Tips4>>

    @Query("select * from Tips5 order by id")
    fun getTips5(): LiveData<List<Tips5>>

    @Query("select * from Tips6 order by id")
    fun getTips6(): LiveData<List<Tips6>>
}