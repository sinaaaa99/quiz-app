package com.example.mamaquizapp.repository

import androidx.lifecycle.LiveData
import com.example.mamaquizapp.data.model.Answers
import com.example.mamaquizapp.data.model.QuestionAndAllAnswers
import com.example.mamaquizapp.data.model.Questions

interface QuizRepository {


    suspend fun insertQuestions(questions: Questions)

    suspend fun insertAnswers(answers: Answers)

    fun getQuestions(): LiveData<List<Questions>>

    fun getQuestionAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>>
}