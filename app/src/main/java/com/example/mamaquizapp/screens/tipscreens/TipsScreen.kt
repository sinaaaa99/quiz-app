package com.example.mamaquizapp.screens.tipscreens

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import kotlinx.coroutines.launch


@Composable
fun TipsScreen(navHostController: NavHostController, tipsViewModel: TipsViewModel,CategoryTip:Int) {

    var enabled by remember {
        mutableStateOf(false)
    }

    val interactionSource = MutableInteractionSource()

    val coroutineScope = rememberCoroutineScope()

    val scale = remember {
        Animatable(1f)
    }

    var answerVisibility by remember {
        mutableStateOf(false)
    }

    val animateRotate by animateFloatAsState(
        targetValue = if (answerVisibility) 360f else 0f,
        animationSpec = tween(2500)
    )


    val visibleState = remember {
        mutableStateOf(false)
    }

    LaunchedEffect(Unit) {
//        delay(10)

        visibleState.value = true

    }








    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = darkcolor),
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.width(4.dp))

            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = Color.White)

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "مراقبت در طول لیبر و زایمان",
                style = TextStyle(
                    fontFamily = vazir,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    textDirection = TextDirection.Rtl, textAlign = TextAlign.Center,
                ), fontWeight = FontWeight.Bold, color = Color.White
            )

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

                    Text(
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp),
                        text = "مراقبت مادری احترام آمیز",
                        style = TextStyle(
                            fontFamily = vazir,
                            fontWeight = FontWeight.Normal,
                            fontSize = 18.sp,
                            textDirection = TextDirection.Rtl, textAlign = TextAlign.Center,
                        ), fontWeight = FontWeight.Bold
                    )

                    DrawLineDash()

                    Text(
                        modifier = Modifier.padding(top = 4.dp),
                        text = "حقوق زنان باردار و مادران توسط تیم مراقبت مورد توجه قرار گیرد. مراقبتی که کرامت، حریم خصوصی و محرمانه بودن تمامی زنان را حفظ نموده، مراقبت عاری از آسیب و بدرفتاری را تضمین و امکان انتخاب آگاهانه، پشتیبانی مداوم و مراقبت توام با توجه، همدلی و درک در طول لیبر و زایمان را فراهم کند.",
                        style = TextStyle(
                            fontFamily = vazir,
                            fontWeight = FontWeight.Normal,
                            fontSize = 16.sp,
                            textDirection = TextDirection.Rtl
                        ), textAlign = TextAlign.Right
                    )


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

                            Text(
                                text = "توصیه شده",
                                style = TextStyle(
                                    fontFamily = vazir,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 16.sp,
                                    textDirection = TextDirection.Rtl
                                ), textAlign = TextAlign.Center
                            )
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
                        text = "بعدی",
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


