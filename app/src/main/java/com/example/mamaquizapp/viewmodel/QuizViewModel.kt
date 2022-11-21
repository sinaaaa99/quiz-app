package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mamaquizapp.data.model.QuestionAndAllAnswers
import com.example.mamaquizapp.data.model.QuizState
import com.example.mamaquizapp.repository.QuizRepository

class QuizViewModel(repository: QuizRepository) : ViewModel() {


    private val currentState = MediatorLiveData<QuizState>()

    private val allQuestionsAnsAllAnswers = repository.getQuestionAndAllAnswers()
    private val questionAndAllAnswers = MediatorLiveData<QuestionAndAllAnswers>()
    private val currentQuestion = MutableLiveData<Int>()

    private var score: Int = 0


    fun getCurrentState(): LiveData<QuizState> = currentState
//    fun getCurrentQuiz(): LiveData<QuestionAndAllAnswers> = questionAndAllAnswers

    private fun changeCurrentQuestion() {
        currentQuestion.postValue(currentQuestion.value?.inc())
    }

    private fun addStateSource() {
        currentState.addSource(currentQuestion) { currentQuestionNum ->

            if (currentQuestionNum == allQuestionsAnsAllAnswers.value?.size) {

                currentState.postValue(QuizState.FinishState(currentQuestionNum, score))
            }

        }

        currentState.addSource(questionAndAllAnswers) { questionAndAllAnswers ->
            currentState.postValue(QuizState.DataState(questionAndAllAnswers))
        }

    }

    private fun addQuestionSource() {

        questionAndAllAnswers.addSource(currentQuestion) { currentQuestionNum ->

            val questions = allQuestionsAnsAllAnswers.value

            if (questions != null && currentQuestionNum < questions.size) {

                questionAndAllAnswers.postValue(questions[currentQuestionNum])
            }

        }

        questionAndAllAnswers.addSource(allQuestionsAnsAllAnswers) { allQuestionsAnsAllAnswers ->

            val currentQuestionNum = currentQuestion.value

            if (currentQuestionNum != null && allQuestionsAnsAllAnswers.isNotEmpty()) {

                questionAndAllAnswers.postValue(allQuestionsAnsAllAnswers[currentQuestionNum])
            }
        }
    }

    fun nextQuestion(choice: Int) {

        verifyAnswer(choice)
        changeCurrentQuestion()


    }

    private fun verifyAnswer(choice: Int) {

        val currentQue = questionAndAllAnswers.value

        if (currentQue != null && currentQue.answers[choice].isCorrect) {

            score++
        }

    }


    init {

        currentState.postValue(QuizState.LoadingState)

        addStateSource()
        addQuestionSource()
        currentQuestion.postValue(0)


    }


}