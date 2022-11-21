package com.example.mamaquizapp.repository

import androidx.lifecycle.LiveData
import com.example.mamaquizapp.QuizApplication
import com.example.mamaquizapp.data.model.Answers
import com.example.mamaquizapp.data.model.QuestionAndAllAnswers
import com.example.mamaquizapp.data.model.Questions

class Repository : QuizRepository {

    //implement quizDao
    private val quizDao by lazy {

        QuizApplication.database.quizDao()
    }

    private val allQuestions by lazy {
        quizDao.getAllQuestion()
    }

    private val allQuestionAndAllAnswers by lazy {
        quizDao.getAllQuestionsAndAllAnswers()
    }


    override suspend fun insertQuestions(questions: Questions) {

        quizDao.insertQuestion(questions)
    }

    override suspend fun insertAnswers(answers: Answers) {

        quizDao.insertAnswers(answers)
    }

    override fun getQuestions(): LiveData<List<Questions>> {
        return allQuestions
    }

    override fun getQuestionAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>> {
        return allQuestionAndAllAnswers
    }

    override suspend fun updateQuestionState(isAnswerd: Boolean, answerStatee: Boolean, id: Int) {
        quizDao.updateQuestionState(isAnswerd,answerStatee,id)
    }
}