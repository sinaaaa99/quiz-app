package com.example.mamaquizapp.screens.quizscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mamaquizapp.ui.theme.*
import com.example.mamaquizapp.viewmodel.QuizViewModelnew

@Composable
fun FinishScreen(quizViewModel: QuizViewModelnew) {

    val context = LocalContext.current
    val activity = context.findActivity()

    val intent = activity?.intent

    val getQuestionType = intent?.getIntExtra("questionType", 0)

    val questions = quizViewModel.getAllQuestions.observeAsState().value


    val scrollable = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkcolor),
        verticalArrangement = Arrangement.Top,
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

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
                style = MaterialTheme.typography.h5,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollable)
                .background(darkcolor),
            verticalArrangement = Arrangement.Top,
        ) {


            Text(
                text = when (getQuestionType) {

                    1 -> {
                        "خانمی 30 ساله، نولی پار، با بارداری کم خطر، اتقباضات نامنظم رحمی و دیلاتاسیون سرویکس 3 سانتی¬متر، ساکن در یکی از شهرستان¬های آذربایجان شرقی، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی در موقع پذیرش برای ایشان توصیه و ارائه گردد؟"
                    }
                    2 -> {
                        "خانمی 25 ساله، نولی پار، با بارداری کم خطر، دیلاتاسیون سرویکس 4 سانتی¬متر، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی را در موقع پذیرش برای ایشان توصیه و ارائه گردد؟"
                    }
                    3 -> {
                        "خانمی 22 ساله، با بارداری کم خطر و سابقه یک بار زایمان طبیعی، اتقباضات منظم رحمی و دیلاتاسیون سرویکس 6 سانتی متر، به بیمارستان آموزشی درمانی (بیمارستان سطح سه مجهز به بخش LDR) مراجعه نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                    }
                    4 -> {
                        "خانمی 28 ساله، با بارداری کم خطر، با سابقه یک بار زایمان طبیعی، دیلاتاسیون سرویکس 10 سانتی متر، جایگاه سر جنین صفر، با وزن تقریبی جنین 3800 گرم در سونوگرافی، در بیمارستان سطح سه مجهز به بخش LDR بستری شده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                    }
                    5 -> {
                        "خانمی 19 ساله، بدون سابقه زایمان، دیلاتاسیون سرویکس 6 سانتی متر، جایگاه سر جنین 1-، در بیمارستان سطح سه مجهز به بخش LDR بستری و به منظور تسکین درد، آنالژزی اپیدورال (با دوز کم) دریافت نموده است. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                    }
                    6 -> {
                        "مادری 38 ساله با سابقه سه بار زایمان طبیعی، شروع خود بخود انقباضات رحمی و عدم دریافت اکسی توسین طی لیبر، نوزاد خود را طی زایمان طبیعی کم عارضه و با شروع خود بخودی تنفس و وزن 2400 گرم بدنیا آورد. با توجه به توضیحات ارائه شده، کدام یک از گزینه¬های مراقبتی را در بخش لیبر برای ایشان توصیه و ارائه گردد؟"
                    }
                    7 -> {
                        "مادری 32 ساله، پریمی¬پار، بدنبال زایمان طبیعی کم عارضه و با اپی¬زیاتومی درجه دو، به بخش پس از زایمان انتقال یافته است. کدام یک از گزینه¬های مراقبتی را برای ایشان توصیه و ارائه می نمائید؟"
                    }
                    else -> ""
                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.h6,
                color = Color.White
            )

            questions?.forEach { question ->

                if (question.questionType == getQuestionType) {

                    EachQuestion(
                        question = question.questionText,
                        answer = question.answerText,
                        question.answerState
                    )

                }


            }

            /*LazyRow(reverseLayout = true) {
                if (questions != null) {
                    items(questions.size) {

                        EachQuestion(
                            question = questions[it].questionText,
                            answer = questions[it].answerText,
                            answerState = questions[it].answerState
                        )
                    }
                }

            }*/

        }

    }
}


@Composable
fun EachQuestion(question: String, answer: String, answerState: Boolean) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 8.dp,
        backgroundColor = khaky
    ) {

//        if (answerState) Greenmedium else darkred

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
        ) {

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                text = "سوال : $question",
                textAlign = TextAlign.End,
                color = Color.Black
            )

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),
                color = Bluelight
            )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                text = "پاسخ : $answer",
                textAlign = TextAlign.End,
                color = if (answerState) Greenmedium else darkred
            )
        }

    }
}