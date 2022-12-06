package com.example.mamaquizapp.screens.tipscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mamaquizapp.data.model.PrepopulateTipsMenu
import com.example.mamaquizapp.ui.theme.darkcolor

@Composable
fun TipsMainScreen(navHostController: NavHostController) {

    val tipsList = PrepopulateTipsMenu.listOfTipsMenuItem


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkcolor)
            .padding(2.dp)
    ) {


        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(4.dp))

            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = Color.White)

            Text(
                text = "نکات آموزشی",
                style = MaterialTheme.typography.h1,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
        }

        LazyColumn {

            itemsIndexed(tipsList) { index, tipsItem ->

                TipsMenuItem(tipsItem, navHostController)

            }
        }

    }


}