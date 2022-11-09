package com.example.mamaquizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mamaquizapp.data.model.QuizState
import com.example.mamaquizapp.repository.Repository
import com.example.mamaquizapp.screens.quizscreen.DrawLineDash
import com.example.mamaquizapp.screens.quizscreen.FinishScreen
import com.example.mamaquizapp.screens.quizscreen.LoadingScreen
import com.example.mamaquizapp.screens.quizscreen.QuestionScreen
import com.example.mamaquizapp.ui.theme.DeepBlue
import com.example.mamaquizapp.ui.theme.MamaQuizAppTheme
import com.example.mamaquizapp.viewmodel.QuizViewModel
import com.example.mamaquizapp.viewmodel.QuizViewModelFactory

class QuizActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val quizViewModel: QuizViewModel =
                viewModel(factory = QuizViewModelFactory(Repository()))

            val state = quizViewModel.getCurrentState().observeAsState().value


            MamaQuizAppTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {


                    when (state) {
                        is QuizState.LoadingState -> LoadingScreen()
                        is QuizState.DataState -> QuestionScreen(state, quizViewModel)
                        is QuizState.FinishState -> FinishScreen(state.score, state.questionCount)
                        else -> LoadingScreen()
                    }


                }
            }
        }
    }
}
