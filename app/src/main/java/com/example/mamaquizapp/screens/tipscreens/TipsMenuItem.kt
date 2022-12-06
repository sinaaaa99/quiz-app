package com.example.mamaquizapp.screens.tipscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mamaquizapp.data.model.TipsClass
import com.example.mamaquizapp.ui.theme.*
import com.example.mamaquizapp.R
import com.example.mamaquizapp.data.model.TipsDestinationRoute

@Composable
fun TipsMenuItem(
    tipsItem: TipsClass = TipsClass(
        "مراقبت در طول لیبر و زایمان", tipLight1, R.drawable.tip_one
    ), navHostController: NavHostController
) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .clickable {

                navHostController.navigate(TipsDestinationRoute.TipsScreen.Route) {

                    popUpTo(TipsDestinationRoute.MainTipsScreen.Route) {

                        inclusive = true
                    }
                }

            }
            .padding(7.5.dp),
        shape = RoundedCornerShape(8.dp), elevation = 4.dp
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(tipsItem.lightColor)
        ) {


            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.2f)
                    .padding(15.dp), contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = tipsItem.image),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                )


            }


            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.6f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = tipsItem.title,
                    style = MaterialTheme.typography.h1,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "0 مرور",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    textAlign = TextAlign.Center
                )


            }


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.2f)
                    .padding(4.dp), contentAlignment = Alignment.Center
            ) {

                Box(
                    modifier = Modifier
                        .border(2.dp, darkcolor, CircleShape)
                        .padding(15.dp), contentAlignment = Alignment.Center
                ) {

                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "", tint = darkcolor
                    )

                }


            }


        }

    }


}