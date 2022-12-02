package com.example.mamaquizapp.screens.quizscreen

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.util.Log
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
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
import androidx.navigation.NavHostController
import com.example.mamaquizapp.R
import com.example.mamaquizapp.data.model.DestinationRoute
import com.example.mamaquizapp.ui.theme.*
import com.example.mamaquizapp.viewmodel.QuizViewModelnew
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun QuestionScreen(quizViewModel: QuizViewModelnew, navHostController: NavHostController) {

    val interactionSource = MutableInteractionSource()
    val scale = remember {
        Animatable(1f)
    }

    val coroutineScope = rememberCoroutineScope()

//    quizViewModel.currentQuestionNum.postValue(0)

    val quizData = quizViewModel.questionAndAnswers.observeAsState().value


    val context = LocalContext.current
    val activity = context.findActivity()

    val intent = activity?.intent

    val getQuestionType = intent?.getIntExtra("questionType", 0)


    /*val quizData1: Any? = if (quizData?.question?.questionType==getQuestionType) {

        quizData

    } else {

        navHostController.navigate(DestinationRoute.FinishScreen.route)

    }*/

//    quizViewModel.determineCurrentQuestion(getQuestionType!!)


    var answerIndex by remember(quizData) {
        mutableStateOf<Int?>(null)
    }

    val questionNumber by remember(quizData) {
        mutableStateOf(quizData?.question?.questionNum)
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

    val lastQuestion by remember(quizData) {
        mutableStateOf(quizData?.question?.isLast)
    }


    //answer state
    val isAnswered by remember(quizData) {
        mutableStateOf(quizData?.question?.isAnswered)
    }
    var answerState by remember(quizData) {
        mutableStateOf(false)
    }
    val questionId by remember(quizData) {
        mutableStateOf(quizData?.question?.id)
    }

    var cardVisibility by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(quizData) {
        delay(100)
        cardVisibility = true
    }

    if (isAnswered == true) {
        quizViewModel.ignoreAnsweredQuiz()
    }


    val isFinish = when (getQuestionType) {
        1 -> quizViewModel.readData1
        2 -> quizViewModel.readData2
        3 -> quizViewModel.readData3
        4 -> quizViewModel.readData4
        5 -> quizViewModel.readData5
        6 -> quizViewModel.readData6
        7 -> quizViewModel.readData7
        else -> false

    }


    if (isFinish) {
        navigateToFinish(navHostController)
    }


//    Log.d("lastQuiz", lastQuestion.toString())


    //    if (quizData!!.question.questionType == getQuestionType)


//    Log.d("questionType",getQuestionType.toString())

    val scrollable = rememberScrollState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkcolor)
            .padding(8.dp)
            .verticalScroll(scrollable)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(4.dp))

            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "", tint = Color.White)

            Text(
                text = when (getQuestionType) {
                    1 -> {
                        "سناریوی مرحله اول"
                    }
                    2 -> {
                        "سناریوی مرحله دوم"
                    }
                    3 -> {
                        "سناریوی مرحله سوم"
                    }
                    4 -> {
                        "سناریوی مرحله چهارم"
                    }
                    5 -> {
                        "سناریوی مرحله پنجم"
                    }
                    6 -> {
                        "سناریوی مرحله ششم"
                    }
                    7 -> {
                        "سناریوی مرحله هفتم"
                    }
                    else -> ""
                },
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(8.dp))


        AnimatedVisibility(
            visible = cardVisibility,
            enter = fadeIn(animationSpec = tween(2000)) + expandVertically(

                animationSpec = tween(2500, easing = EaseInBounce)
            )
        ) {


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
                        text = when (getQuestionType) {

                            1 -> {
                                "خانمی 30 ساله، نولی پار، با بارداری کم خطر، اتقباضات نامنظم رحمی و دیلاتاسیون سرویکس 3 سانتی متر، ساکن در یکی از شهرستان های آذربایجان شرقی، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه های مراقبتی در موقع پذیرش برای ایشان توصیه و ارائه گردد؟"
                            }
                            2 -> {
                                "خانمی 25 ساله، نولی پار، با بارداری کم خطر، دیلاتاسیون سرویکس 4 سانتی متر، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه های مراقبتی را در موقع پذیرش برای ایشان توصیه و ارائه گردد؟"
                            }
                            3 -> {
                                "خانمی 22 ساله، با بارداری کم خطر و سابقه یک بار زایمان طبیعی، اتقباضات منظم رحمی و دیلاتاسیون سرویکس 6 سانتی متر، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                            }
                            4 -> {
                                "خانمی 28 ساله، با بارداری کم خطر، با سابقه یک بار زایمان طبیعی، دیلاتاسیون سرویکس 10 سانتی متر، جایگاه سر جنین صفر، با وزن تقریبی جنین 3800 گرم در سونوگرافی، در بیمارستان سطح سه مجهز به بخش LDR بستری شده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                            }
                            5 -> {
                                "خانمی 19 ساله، بدون سابقه زایمان، دیلاتاسیون سرویکس 6 سانتی متر، جایگاه سر جنین 1-، در بیمارستان سطح سه مجهز به بخش LDR بستری و به منظور تسکین درد، آنالژزی اپیدورال (با دوز کم) دریافت نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                            }
                            6 -> {
                                "مادری 38 ساله با سابقه سه بار زایمان طبیعی، شروع خود بخود انقباضات رحمی و عدم دریافت اکسی توسین طی لیبر، نوزاد خود را طی زایمان طبیعی کم عارضه و با شروع خود بخودی تنفس و وزن 2400 گرم بدنیا آورد. با توجه به توضیحات ارائه شده، کدام یک از گزینه های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                            }
                            7 -> {
                                "مادری 32 ساله، پریمی پار، بدنبال زایمان طبیعی کم عارضه و با اپی زیاتومی درجه دو، به بخش پس از زایمان انتقال یافته است. کدام یک از گزینه های مراقبتی را برای ایشان توصیه و ارائه می نمائید؟"
                            }
                            else -> ""
                        }, modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.h1,
                        color = Color.White
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
                                    fontStyle = MaterialTheme.typography.h1.fontStyle,
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            ) {

                                append("سوال ")
                            }

                            withStyle(
                                SpanStyle(
                                    fontStyle = MaterialTheme.typography.body1.fontStyle,
                                    color = Color.White,
                                    fontSize = 12.sp,
                                )
                            ) {

                                append(questionNumber.toString())
                            }
                        })

                    Spacer(modifier = Modifier.height(5.dp))


                    if (quizData != null) {
                        Text(
                            text = quizData.question.questionText,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(3.dp),
                            style = MaterialTheme.typography.h1,
                            textAlign = TextAlign.Start,
                            color = Color.White,
                            fontWeight = FontWeight.Bold

                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    DrawLineDash()

                    Spacer(modifier = Modifier.height(12.dp))


                    quizData?.answers?.forEachIndexed { index, answer ->

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

                                    answerState = answer.isCorrect
                                },
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            RadioButton(
                                selected = answerIndex == index,
                                onClick = {
                                    answerIndex = index

                                    answerState = answer.isCorrect

                                })


                            Text(
                                text = answer.answerText,
                                color = Color.White,
                                style = MaterialTheme.typography.body1,
                                fontSize = 14.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(modifier = Modifier
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

                            if (answerIndex != null) {

                                quizViewModel.nextQuestion(answerIndex!!)

                                checkNum += 0.1f

//                            questionNumber = questionNumber?.plus(1)

                                if (lastQuestion == true) {

                                    navHostController.navigate(DestinationRoute.FinishScreen.route) {
                                        popUpTo(DestinationRoute.QuestionsScreen.route) {
                                            inclusive = true
                                        }
                                    }
                                }

                                questionId?.let {
                                    quizViewModel.updateQuestionState(
                                        true,
                                        answerState,
                                        it
                                    )
                                }

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

                        Text(
                            style = MaterialTheme.typography.body1,
                            text = if (lastQuestion == false) {
                                "بعدی"
                            } else {
                                "پایان"
                            }
                        )

                        Spacer(modifier = Modifier.width(3.dp))

                        Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                    }


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

fun navigateToFinish(navHostController: NavHostController) =
    navHostController.navigate(DestinationRoute.FinishScreen.route) {
        popUpTo(DestinationRoute.QuestionsScreen.route) {
            inclusive = true
        }
    }
