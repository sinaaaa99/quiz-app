package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.*
import com.example.mamaquizapp.data.model.QuestionAndAllAnswers
import com.example.mamaquizapp.repository.QuizRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuizViewModelnew(private val repository: QuizRepository) : ViewModel() {

    private val allQuizAndAnswers = repository.getQuestionAndAllAnswers()

    private val _questionAndAnswers = MediatorLiveData<QuestionAndAllAnswers>()
    val questionAndAnswers: LiveData<QuestionAndAllAnswers> get() = _questionAndAnswers

    private val currentQuestionNum = MutableLiveData<Int>()

    val getAllQuestions = repository.getQuestions()

    private var score: Int = 0

    val isFinished = MutableLiveData(false)

//    fun getCurrentQuiz(): LiveData<QuestionAndAllAnswers> = _questionAndAnswers

    private fun addQuestionState() {

        _questionAndAnswers.addSource(allQuizAndAnswers) { allQuizAndAnswer ->

            val currentquiz = currentQuestionNum.value

            if (allQuizAndAnswer.isNotEmpty() && currentquiz != null) {

                _questionAndAnswers.postValue(allQuizAndAnswer[currentquiz])
            }


        }

        _questionAndAnswers.addSource(currentQuestionNum) { currentquestion ->

            val questions = allQuizAndAnswers.value

            if (questions != null && currentquestion < questions.size) {

                _questionAndAnswers.postValue(questions[currentquestion])
            }

        }


    }


    fun nextQuestion(index: Int) {
        currentQuestionNum.postValue(currentQuestionNum.value?.inc())

        verifyQuestion(index)
    }

    private fun verifyQuestion(choice: Int) {

        val currentQuestion = _questionAndAnswers.value

        if (currentQuestion != null && currentQuestion.answers[choice].isCorrect) {

            score++
        }

    }

    fun determineCurrentQuestion(category: Int) {

        when (category) {

            1 -> currentQuestionNum.postValue(0)
            2 -> currentQuestionNum.postValue(10)
            3 -> currentQuestionNum.postValue(16)
            4 -> currentQuestionNum.postValue(26)
            5 -> currentQuestionNum.postValue(32)
            6 -> currentQuestionNum.postValue(36)
            7 -> currentQuestionNum.postValue(42)
        }


    }

    fun updateQuestionState(isAnswerd: Boolean, answerStatee: Boolean, id: Int) {


        viewModelScope.launch(Dispatchers.IO) {

            repository.updateQuestionState(isAnswerd, answerStatee, id)
        }
    }


    init {

//        currentQuestionNum.postValue(0)
        addQuestionState()

    }


}