package com.example.mamaquizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mamaquizapp.repository.Repository
import com.example.mamaquizapp.screens.mainscreen.MainScreen
import com.example.mamaquizapp.ui.theme.MamaQuizAppTheme
import com.example.mamaquizapp.viewmodel.MainViewModel
import com.example.mamaquizapp.viewmodel.MainViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewModel: MainViewModel =
                viewModel(factory = MainViewModelFactory(Repository()))

            viewModel.prepopulateQuestion()


            MamaQuizAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}
