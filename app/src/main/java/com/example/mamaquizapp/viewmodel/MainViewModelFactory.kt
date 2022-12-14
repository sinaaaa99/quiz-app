package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mamaquizapp.repository.QuizRepository

class MainViewModelFactory(private val repository: QuizRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) = MainViewModel(repository) as T


}