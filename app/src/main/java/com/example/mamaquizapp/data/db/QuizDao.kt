package com.example.mamaquizapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mamaquizapp.data.model.Answers
import com.example.mamaquizapp.data.model.QuestionAndAllAnswers
import com.example.mamaquizapp.data.model.Questions

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

    @Query("update questions set isAnswered = :isAnswerd , answerState=:answerStatee where question_id=:id")
    suspend fun updateQuestionState(isAnswerd: Boolean, answerStatee: Boolean, id: Int)
}