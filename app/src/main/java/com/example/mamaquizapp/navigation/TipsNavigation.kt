package com.example.mamaquizapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mamaquizapp.data.model.TipsDestinationRoute
import com.example.mamaquizapp.screens.tipscreens.TipsMainScreen
import com.example.mamaquizapp.screens.tipscreens.TipsScreen
import com.example.mamaquizapp.viewmodel.TipsViewModel

@Composable
fun TipsNavigation(navHostController: NavHostController,tipsViewModel: TipsViewModel) {

    NavHost(
        navController = navHostController,
        startDestination = TipsDestinationRoute.MainTipsScreen.Route
    ) {

        composable(TipsDestinationRoute.MainTipsScreen.Route) {

            TipsMainScreen(navHostController)
        }

        composable(TipsDestinationRoute.TipsScreen.Route) {

            TipsScreen(navHostController,tipsViewModel)
        }

    }
}