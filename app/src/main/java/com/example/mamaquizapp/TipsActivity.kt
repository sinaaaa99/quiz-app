package com.example.mamaquizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.mamaquizapp.navigation.TipsNavigation
import com.example.mamaquizapp.repository.TRepository
import com.example.mamaquizapp.ui.theme.MamaQuizAppTheme
import com.example.mamaquizapp.viewmodel.TipsViewModel
import com.example.mamaquizapp.viewmodel.TipsViewModelFactory

class TipsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            val tipsViewModel: TipsViewModel = viewModel(
                factory = TipsViewModelFactory(TRepository())
            )

            MamaQuizAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    TipsNavigation(navHostController = navController, tipsViewModel)
                }
            }
        }
    }
}
