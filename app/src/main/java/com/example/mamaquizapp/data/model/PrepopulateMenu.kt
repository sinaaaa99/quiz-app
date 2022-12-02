package com.example.mamaquizapp.data.model

import com.example.mamaquizapp.R
import com.example.mamaquizapp.ui.theme.*

object PrepopulateMenu {

    val listOfMenu = menuList()


    private fun menuList(): List<MenusClass> {

        return listOf(

            MenusClass(
                "آزمون اول",
                R.drawable.quiz_one,
                GreenDark,
                Greenmedium,
                Greenlight
            ),
            MenusClass(
                "آزمون دوم",
                R.drawable.quiz_two,
                PinkDark,
                Pinkmedium,
                Pinklight
            ),
            MenusClass(
                "آزمون سوم",
                R.drawable.quiz_tree,
                OilDark,
                Oilmedium,
                Oillight
            ),
            MenusClass(
                "آزمون چهارم",
                R.drawable.quiz_four,
                PurpleDark,
                Purplemedium,
                Purplelight
            ),
            MenusClass(
                "آزمون پنجم",
                R.drawable.quiz_five,
                YellowDark,
                Yellowmedium,
                Yellowlight
            ),
            MenusClass(
                "آزمون ششم",
                R.drawable.quiz_six,
                OrangeDark,
                Orangemedium,
                Orangelight
            ),
            MenusClass(
                "آزمون هفتم",
                R.drawable.quiz_seven,
                BlueDark,
                Bluemedium,
                Bluelight
            )
        )
    }


}