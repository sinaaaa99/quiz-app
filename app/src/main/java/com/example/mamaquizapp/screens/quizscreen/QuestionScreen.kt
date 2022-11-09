package com.example.mamaquizapp.screens.quizscreen

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mamaquizapp.R
import com.example.mamaquizapp.data.model.QuizState
import com.example.mamaquizapp.ui.theme.*
import com.example.mamaquizapp.viewmodel.QuizViewModel

@Composable
fun QuestionScreen(quizData: QuizState.DataState, quizViewModel: QuizViewModel) {


    var answerIndex by remember(quizData) {
        mutableStateOf<Int?>(null)
    }

    var checkNum by remember {
        mutableStateOf(0.0f)
    }

    val animationProgress by animateFloatAsState(
        targetValue = checkNum, tween(
            durationMillis = 300,
            delayMillis = 100,
            easing = LinearOutSlowInEasing
        )
    )

    var questionNumber by remember {
        mutableStateOf(1)
    }


    val context = LocalContext.current
    val activity = context.findActivity()

    val intent = activity?.intent

    val getQuestionType = intent?.getIntExtra("questionType", 0)

    val questionData =
        if (quizData.data.question.questionType == getQuestionType) quizData else TODO()


//    Log.d("questionType",getQuestionType.toString())

    val scrollable = rememberScrollState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DeepBlue)
            .padding(8.dp)
            .verticalScroll(scrollable)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = Color.White)

            Text(
                text = "سناریوی مرحله اول",
                style = MaterialTheme.typography.h5,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(8.dp))


        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            PurpleDark,
                            Purplelight
                        )
                    )
                )
                .padding(horizontal = 8.dp, vertical = 16.dp)
        )
        {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    text = "خانمی 30 ساله، نولی پار، با بارداری کم خطر، اتقباضات نامنظم رحمی و دیلاتاسیون سرویکس 3 سانتی¬متر، ساکن در یکی از شهرستان¬های آذربایجان شرقی، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی در موقع پذیرش برای ایشان توصیه و ارائه گردد؟",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End,
                    style = MaterialTheme.typography.h6
                )



                Spacer(modifier = Modifier.height(8.dp))

                ProgressbarQuiz(animationProgress)

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = buildAnnotatedString {

                        withStyle(
                            SpanStyle(
                                fontStyle = MaterialTheme.typography.h6.fontStyle,
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {

                            append("سوال ")
                        }

                        withStyle(
                            SpanStyle(
                                fontStyle = MaterialTheme.typography.caption.fontStyle,
                                color = Color.White,
                                fontSize = 12.sp,
                            )
                        ) {

                            append(questionNumber.toString())
                        }
                    })

                Spacer(modifier = Modifier.height(5.dp))


                Text(
                    text = questionData.data.question.questionText,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(3.dp),
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.End,
                    color = Color.White,
                    fontWeight = FontWeight.Bold

                )

                Spacer(modifier = Modifier.height(8.dp))

                DrawLineDash()

                Spacer(modifier = Modifier.height(12.dp))


                questionData.data.answers.forEachIndexed { index, answer ->

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(3.dp)
                            .height(55.dp)
                            .background(color = Purplemedium, shape = RoundedCornerShape(10.dp))
                            /*.border(
                                width = 2.dp, brush = Brush.linearGradient(
                                    colors = listOf(
                                        OilDark, Oilmedium
                                    )
                                ), shape = RoundedCornerShape(15.dp)
                            )*/
                            .clip(RoundedCornerShape(50.dp))
                            .padding(8.dp)
                            .clickable {
                                answerIndex = index
                            },
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        RadioButton(
                            selected = answerIndex == index,
                            onClick = {
                                answerIndex = index

                            })


                        Text(
                            text = answer.answerText,
                            color = Color.White,
                            style = MaterialTheme.typography.caption
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(modifier = Modifier
                    .height(50.dp)
                    .clickable {

                        if (answerIndex != null) {

                            quizViewModel.nextQuestion(answerIndex!!)

                            checkNum += 0.1f

                            questionNumber += 1

                            Log.d("checkNum", checkNum.toString())
                        } else {
                            Toast
                                .makeText(
                                    context,
                                    "لطفا یکی از گزینه ها را انتخاب کنید",
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

                    Text(text = "بعدی")

                    Spacer(modifier = Modifier.width(3.dp))

                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }


            }
        }


    }
}


@Composable
fun DrawLineDash() {
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
    ) {


        drawLine(
            color = Oilmedium,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f),
            strokeWidth = 3f
        )

    }
}


@Composable
fun ProgressbarQuiz(checkNum: Float) {

    val buttonWidth by remember(checkNum) {

        mutableStateOf(checkNum * 1f)
    }


    Row(
        modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth()
            .height(40.dp)
            .border(
                width = 3.dp,
                brush = Brush.linearGradient(listOf(OilDark, Oilmedium)),
                shape = RoundedCornerShape(10.dp)
            )
            .clip(RoundedCornerShape(50.dp))
            .padding(start = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Button(
            contentPadding = PaddingValues(3.dp),
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(buttonWidth)
                .background(
                    brush = Brush.linearGradient(
                        listOf(
                            Purplemedium, Pinkmedium
                        )
                    )
                ),
            colors = buttonColors(
                backgroundColor = Color.Transparent,
                disabledBackgroundColor = Color.Transparent
            ),
            enabled = false,
            elevation = null
        ) {}

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(35.dp)
        ) {

            Icon(
                painter = painterResource(id = R.drawable.finish_quiz),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                tint = Color.White
            )
        }


    }

}

fun Context.findActivity(): Activity? = when (this) {
    is Activity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}
