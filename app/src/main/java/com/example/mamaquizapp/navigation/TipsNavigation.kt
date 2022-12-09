package com.example.mamaquizapp.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mamaquizapp.data.model.CategoryTipType
import com.example.mamaquizapp.data.model.TipsDestinationRoute
import com.example.mamaquizapp.screens.tipscreens.TipsMainScreen
import com.example.mamaquizapp.screens.tipscreens.TipsScreen
import com.example.mamaquizapp.viewmodel.TipsViewModel

@Composable
fun TipsNavigation(navHostController: NavHostController, tipsViewModel: TipsViewModel) {

    NavHost(
        navController = navHostController,
        startDestination = TipsDestinationRoute.MainTipsScreen.Route
    ) {

        composable(TipsDestinationRoute.MainTipsScreen.Route) {

            TipsMainScreen(navHostController)
        }

        composable(
            TipsDestinationRoute.TipsScreen.Route,
            arguments = listOf(
                navArgument(CategoryTipType) {
                    type = NavType.IntType
                }
            )
        ) {

//            Log.d("Argumentss", it.arguments?.getInt(CategoryTipType).toString())

            val categoryTip = it.arguments?.getInt(CategoryTipType) ?: 1

            TipsScreen(navHostController, tipsViewModel, categoryTip)
        }

    }
}