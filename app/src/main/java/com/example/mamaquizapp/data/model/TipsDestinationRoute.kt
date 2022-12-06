package com.example.mamaquizapp.data.model

sealed class TipsDestinationRoute(val Route: String) {

    object MainTipsScreen : TipsDestinationRoute("MainTipsScreen")
    object TipsScreen : TipsDestinationRoute("TipsScreen")
}