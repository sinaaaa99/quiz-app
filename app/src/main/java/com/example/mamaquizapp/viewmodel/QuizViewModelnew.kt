package com.example.mamaquizapp.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.mamaquizapp.data.model.QuestionAndAllAnswers
import com.example.mamaquizapp.repository.QuizRepository
import com.example.mamaquizapp.repository.SharedPreferenceRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuizViewModelnew(private val repository: QuizRepository, application: Application) :
    AndroidViewModel(application) {

    private val allQuizAndAnswers = repository.getQuestionAndAllAnswers()

    private val _questionAndAnswers = MediatorLiveData<QuestionAndAllAnswers>()
    val questionAndAnswers: LiveData<QuestionAndAllAnswers> get() = _questionAndAnswers

    private val currentQuestionNum = MutableLiveData<Int>()

    val getAllQuestions = repository.getQuestions()

    private var score: Int = 0

    private val shredPref = SharedPreferenceRepository(application)

//    private val dataStoreRepository = DataStoreRepository(application)

//    val isFinished = MutableLiveData(false)

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

    fun ignoreAnsweredQuiz() {
        currentQuestionNum.postValue(currentQuestionNum.value?.inc())

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

    //change navigate for scenarios
    fun isFinished1() = shredPref.isFinished1()
    val readData1 = shredPref.readData1

    fun isFinished2() = shredPref.isFinished2()
    val readData2 = shredPref.readData2

    fun isFinished3() = shredPref.isFinished3()
    val readData3 = shredPref.readData3

    fun isFinished4() = shredPref.isFinished4()
    val readData4 = shredPref.readData4

    fun isFinished5() = shredPref.isFinished5()
    val readData5 = shredPref.readData5

    fun isFinished6() = shredPref.isFinished6()
    val readData6 = shredPref.readData6

    fun isFinished7() = shredPref.isFinished7()
    val readData7 = shredPref.readData7

    /*fun isFinishedQuiz() = viewModelScope.launch(Dispatchers.IO) {

        dataStoreRepository.saveData()

    }

    val readFinishState = dataStoreRepository.readFromDataStore.asLiveData()
*/

    init {

//        currentQuestionNum.postValue(0)
        addQuestionState()

    }


}