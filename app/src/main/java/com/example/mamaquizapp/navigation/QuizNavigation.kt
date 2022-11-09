package com.example.mamaquizapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mamaquizapp.data.model.DestinationRoute
import com.example.mamaquizapp.screens.quizscreen.FinishScreen
import com.example.mamaquizapp.screens.quizscreen.QuestionScreen

@Composable
fun QuizNavigation(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = DestinationRoute.QuestionsScreen.route ){

        composable(route = DestinationRoute.QuestionsScreen.route){

//            QuestionScreen()

        }

        composable(route = DestinationRoute.FinishScreen.route){

//            FinishScreen()
        }


    }


}