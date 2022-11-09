package com.example.mamaquizapp.data.model

sealed class QuizState {

    object LoadingState : QuizState()
    data class DataState(val data: QuestionAndAllAnswers) : QuizState()
    data class FinishState(val questionCount: Int, val score: Int) : QuizState()
}
