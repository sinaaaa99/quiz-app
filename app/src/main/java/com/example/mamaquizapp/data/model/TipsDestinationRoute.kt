package com.example.mamaquizapp.data.model


const val CategoryTipType = "categoryTip"

sealed class TipsDestinationRoute(val Route: String) {

    object MainTipsScreen : TipsDestinationRoute("MainTipsScreen")
    object TipsScreen : TipsDestinationRoute("TipsScreen/{$CategoryTipType}") {
        fun passCategory(category: Int): String {
            return this.Route.replace(oldValue = "{$CategoryTipType}", newValue = category.toString())
        }
    }
}