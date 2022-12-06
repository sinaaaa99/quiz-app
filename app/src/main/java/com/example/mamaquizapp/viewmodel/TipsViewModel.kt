package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mamaquizapp.data.model.PrepopulateTips
import com.example.mamaquizapp.repository.TipsRepository
import kotlinx.coroutines.launch

class TipsViewModel(private val tipRepository: TipsRepository) : ViewModel() {

    private val _tipsNumber = MutableLiveData(0)
    val tipsNumber: LiveData<Int> get() = _tipsNumber


    //prePopulate Tips in DataBase
    private fun prepopulateTips() {

        viewModelScope.launch {

            for (tips1 in PrepopulateTips.listOfTips1) {
                tipRepository.insertTips1(tips1)
            }

            for (tips2 in PrepopulateTips.listOfTips2) {
                tipRepository.insertTips2(tips2)
            }

            for (tip3 in PrepopulateTips.listOfTips3) {
                tipRepository.insertTips3(tip3)
            }

            for (tip4 in PrepopulateTips.listOfTips4) {
                tipRepository.insertTips4(tip4)
            }

            for (tip5 in PrepopulateTips.listOfTips5) {
                tipRepository.insertTips5(tip5)
            }

            for (tip6 in PrepopulateTips.listOfTips6) {
                tipRepository.insertTips6(tip6)
            }

        }

    }


    //Read Tips
    fun determineTips(TipNumber: Int) {

        when (TipNumber) {

            1 -> tipRepository.getTips1()
            2 -> tipRepository.getTips2()
            3 -> tipRepository.getTips3()
            4 -> tipRepository.getTips4()
            5 -> tipRepository.getTips5()
            6 -> tipRepository.getTips6()
            else -> tipRepository.getTips1()
        }
    }

    fun increaseTipsNumber() {

        _tipsNumber.postValue(_tipsNumber.value?.inc())
    }


    init {

        prepopulateTips()
    }
}