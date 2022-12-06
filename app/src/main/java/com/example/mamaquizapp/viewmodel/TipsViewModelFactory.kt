package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mamaquizapp.repository.TipsRepository

class TipsViewModelFactory(private val tipsRepository: TipsRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        TipsViewModel(tipsRepository) as T
}