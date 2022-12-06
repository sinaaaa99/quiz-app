package com.example.mamaquizapp.data.model

import com.example.mamaquizapp.R
import com.example.mamaquizapp.ui.theme.*

object PrepopulateTipsMenu {

    val listOfTipsMenuItem = tipsMenuItemList()

    private fun tipsMenuItemList(): List<TipsClass> {

        return listOf(

            TipsClass("مراقبت در طول لیبر و زایمان", tipLight1, R.drawable.tip_six),
            TipsClass("مرحله اول لیبر", tipLight2, R.drawable.tip_two),
            TipsClass("مرحله دوم لیبر", tipLight3, R.drawable.tip_three),
            TipsClass("مرحله سوم لیبر", tipLight4, R.drawable.tip_one),
            TipsClass("مراقبت نوزادی", tipLight5, R.drawable.tip_five),
            TipsClass("مراقبتهای مادری پس از زایمان", tipLight6, R.drawable.tip_one)
        )

    }
}