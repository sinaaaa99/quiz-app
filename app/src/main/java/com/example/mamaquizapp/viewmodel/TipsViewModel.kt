package com.example.mamaquizapp.viewmodel

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mamaquizapp.data.model.prepopulate.PrepopulateTips
import com.example.mamaquizapp.data.model.TipsClass
import com.example.mamaquizapp.repository.TipsRepository
import kotlinx.coroutines.launch

class TipsViewModel(private val tipRepository: TipsRepository) : ViewModel() {

    private val _tipsNumber = MutableLiveData(0)
//    val tipsNumber: LiveData<Int> get() = _tipsNumber

    private val _allTipsData = tipRepository.getTips()

    private val _tipsData = MediatorLiveData<TipsClass>()


    //prePopulate Tips in DataBase
    private fun prepopulateTips() {

        viewModelScope.launch {

            for (tipsData in PrepopulateTips.listOfTips) {
                tipRepository.insertTips(tipsData)
            }

        }

    }


    //Read Tip
    private fun addTipsState() {

        _tipsData.addSource(_allTipsData) { AllTips ->

            val currentTipsNum = _tipsNumber.value

            if (AllTips.isNotEmpty() && currentTipsNum != null) {

                _tipsData.postValue(AllTips[currentTipsNum])
            }


        }

        _tipsData.addSource(_tipsNumber) { currentNum ->

            val allTips = _allTipsData.value

            if (allTips != null && currentNum < allTips.size) {

                _tipsData.postValue(allTips[currentNum])
            }


        }

    }

    fun determineCurrentTips(category: Int) {

        when (category) {

            1 -> _tipsNumber.postValue(0)
            2 -> _tipsNumber.postValue(4)
            3 -> _tipsNumber.postValue(32)
            4 -> _tipsNumber.postValue(39)
            5 -> _tipsNumber.postValue(45)
            6 -> _tipsNumber.postValue(50)

            else -> _tipsNumber.postValue(0)
        }


    }


    fun increaseTipsNumber() {

        _tipsNumber.postValue(_tipsNumber.value?.inc())
    }


    init {

        prepopulateTips()

        addTipsState()
    }
}