package com.example.mamaquizapp.screens.tipscreens

import android.util.Log
import android.widget.Toast
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mamaquizapp.screens.quizscreen.DrawLineDash
import com.example.mamaquizapp.ui.theme.*
import com.example.mamaquizapp.viewmodel.TipsViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun TipsScreen(
    navHostController: NavHostController,
    tipsViewModel: TipsViewModel,
    CategoryTip: Int
) {


    val tipsData = tipsViewModel.tipsData.observeAsState().value

    val tipsCategory by remember(tipsData) {

        mutableStateOf(CategoryTip)
    }
//    Log.d("tipsNumber1", tipsCategory.toString())


    val interactionSource = MutableInteractionSource()

    val coroutineScope = rememberCoroutineScope()

    val scale = remember {
        Animatable(1f)
    }

    var answerVisibility by remember(tipsData) {
        mutableStateOf(false)
    }

    var nextState by remember {

        mutableStateOf(false)
    }

    val animateRotate by animateFloatAsState(
        targetValue = if (nextState) 360f else 0f,
        animationSpec = tween(2500)
    )


    val visibleState = remember {
        mutableStateOf(false)
    }

    val isLastTip by remember(tipsData) {
        mutableStateOf(tipsData?.isLast)
    }

    Log.d("isLastTip", isLastTip.toString())

    val context = LocalContext.current

    LaunchedEffect(Unit) {
//        delay(10)

        visibleState.value = true

        tipsViewModel.determineCurrentTips(tipsCategory)

    }

    LaunchedEffect(nextState) {

        delay(2500)
        nextState = false
    }

    /*LaunchedEffect(isLastTip) {
        navHostController.popBackStack()

    }*/


    Log.d("nextState", nextState.toString())



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = darkcolor),
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.width(4.dp))

            Icon(
                modifier = Modifier.clickable {
                    navHostController.popBackStack()
                },
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "",
                tint = Color.White
            )

            if (tipsData != null) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = tipsData.type,
                    style = TextStyle(
                        fontFamily = vazir,
                        fontWeight = FontWeight.Normal,
                        fontSize = 18.sp,
                        textDirection = TextDirection.Rtl, textAlign = TextAlign.Center,
                    ), fontWeight = FontWeight.Bold, color = Color.White
                )
            }

        }

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Card(
                modifier = Modifier
                    .padding(18.dp)
                    .rotate(animateRotate)
                    .clickable {
                        answerVisibility = true
                    }, elevation = 20.dp
            ) {

                Column(
                    modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(YellowDark, Yellowlight)
                            )
                        )
                        .padding(horizontal = 6.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    if (tipsData != null) {
                        Text(
                            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp),
                            text = tipsData.title,
                            style = MaterialTheme.typography.h1, fontWeight = FontWeight.Bold
                        )
                    }

                    DrawLineDash()

                    if (tipsData != null) {
                        Text(
                            modifier = Modifier.padding(top = 4.dp),
                            text = tipsData.subTitle,
                            style = MaterialTheme.typography.body1,
                            textAlign = TextAlign.Right
                        )
                    }


                    AnimatedVisibility(
                        visible = answerVisibility,
                        enter = fadeIn(animationSpec = tween(1000)) + expandVertically(
                            animationSpec = tween(2000, easing = EaseInBounce)
                        )

                    ) {

                        DrawLineDash()

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 12.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {

                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "",
                                tint = Greenmedium
                            )

                            if (tipsData != null) {
                                Text(
                                    text = tipsData.answer,
                                    style = MaterialTheme.typography.h1,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }

                }
            }

            Spacer(modifier = Modifier.height(20.dp))


            AnimatedVisibility(
                visible = visibleState.value,
                enter = fadeIn(animationSpec = tween(2000)) + expandVertically(

                    animationSpec = tween(2500, easing = EaseInSine)
                )
            ) {

                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .scale(scale.value)
                        .clickable(interactionSource = interactionSource, indication = null) {

                            coroutineScope.launch {
                                scale.animateTo(
                                    0.8f,
                                    tween(100)
                                )
                                scale.animateTo(
                                    1f,
                                    tween(100)
                                )
                            }

                            if (answerVisibility) {

                                tipsViewModel.increaseTipsNumber()

                                nextState = true

                                if (isLastTip == true) {

                                    navHostController.popBackStack()
                                }

                            } else {
                                Toast
                                    .makeText(
                                        context,
                                        "لطفا ابتدا کارت را لمس کنید",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }

                        }
                        .border(
                            border = BorderStroke(
                                1.dp,
                                Oilmedium
                            ), RoundedCornerShape(10.dp)
                        )
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        style = MaterialTheme.typography.body1,
                        text = if (isLastTip == false) "بعدی" else "پایان",
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(3.dp))

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }

        }
    }


}


