package com.example.mamaquizapp

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.mamaquizapp.data.model.DestinationRoute
import com.example.mamaquizapp.navigation.QuizNavigation
import com.example.mamaquizapp.repository.Repository
import com.example.mamaquizapp.ui.theme.MamaQuizAppTheme
import com.example.mamaquizapp.viewmodel.QuizViewModelFactory
import com.example.mamaquizapp.viewmodel.QuizViewModelnew

class QuizActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            val navController = rememberNavController()

            val quizViewModel: QuizViewModelnew =
                viewModel(factory = QuizViewModelFactory(Repository(), this.application))

            val getQuestionType = intent.getIntExtra("questionType", 0)

            quizViewModel.determineCurrentQuestion(getQuestionType)


//            val state = quizViewModel.getCurrentState().observeAsState().value


            MamaQuizAppTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {



                    QuizNavigation(navController, quizViewModel)


                    /*when (state) {
                        is QuizState.LoadingState -> LoadingScreen()
                        is QuizState.DataState -> QuestionScreen(state, quizViewModel)
                        is QuizState.FinishState -> FinishScreen(state.score, state.questionCount)
                        else -> LoadingScreen()
                    }*/


                }
            }
        }
    }
}
