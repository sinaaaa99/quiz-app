package com.example.mamaquizapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mamaquizapp.repository.QuizRepository

class QuizViewModelFactory(
    private val repository: QuizRepository,
    private val application: Application
) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        QuizViewModelnew(repository, application) as T
}