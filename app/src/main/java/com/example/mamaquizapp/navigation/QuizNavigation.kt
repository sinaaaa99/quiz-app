package com.example.mamaquizapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mamaquizapp.data.model.DestinationRoute
import com.example.mamaquizapp.screens.quizscreen.FinishScreen
import com.example.mamaquizapp.screens.quizscreen.QuestionScreen
import com.example.mamaquizapp.viewmodel.QuizViewModelnew

@Composable
fun QuizNavigation(navHostController: NavHostController,quizViewModel: QuizViewModelnew) {

    NavHost(navController = navHostController, startDestination = DestinationRoute.QuestionsScreen.route ){

        composable(route = DestinationRoute.QuestionsScreen.route){

            QuestionScreen(quizViewModel,navHostController)

        }

        composable(route = DestinationRoute.FinishScreen.route){

            FinishScreen(quizViewModel)
        }


    }


}