package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mamaquizapp.data.model.prepopulate.PrepopulateDatabase
import com.example.mamaquizapp.repository.QuizRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: QuizRepository) : ViewModel() {


    fun prepopulateQuestion() {

        viewModelScope.launch(Dispatchers.IO) {

            for (question in PrepopulateDatabase.listOfQuestions) {

                repository.insertQuestions(question)
            }

            for (answer in PrepopulateDatabase.listOfAnswers) {

                repository.insertAnswers(answer)
            }
        }

    }
}