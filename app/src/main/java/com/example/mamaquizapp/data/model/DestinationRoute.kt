package com.example.mamaquizapp.data.model

sealed class DestinationRoute(val route:String){

    object QuestionsScreen:DestinationRoute("QuestionsScreen")
    object FinishScreen:DestinationRoute("FinishScreen")
}
