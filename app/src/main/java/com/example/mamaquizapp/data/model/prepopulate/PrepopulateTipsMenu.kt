package com.example.mamaquizapp.data.model.prepopulate

import com.example.mamaquizapp.R
import com.example.mamaquizapp.data.model.TipsMenuClass
import com.example.mamaquizapp.ui.theme.*

object PrepopulateTipsMenu {

    val listOfTipsMenuItem = tipsMenuItemList()

    private fun tipsMenuItemList(): List<TipsMenuClass> {

        return listOf(

            TipsMenuClass("مراقبت در طول لیبر و زایمان", tipLight1, R.drawable.tip_six),
            TipsMenuClass("مرحله اول لیبر", tipLight2, R.drawable.tip_two),
            TipsMenuClass("مرحله دوم لیبر", tipLight3, R.drawable.tip_three),
            TipsMenuClass("مرحله سوم لیبر", tipLight4, R.drawable.tip_one),
            TipsMenuClass("مراقبت نوزادی", tipLight5, R.drawable.tip_five),
            TipsMenuClass("مراقبتهای مادری پس از زایمان", tipLight6, R.drawable.tip_four)
        )

    }
}