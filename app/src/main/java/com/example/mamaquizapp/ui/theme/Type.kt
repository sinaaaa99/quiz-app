package com.example.mamaquizapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp
import com.example.mamaquizapp.R


val shabnam = FontFamily(
    Font(R.font.shabnam),
    Font(R.font.shabnammedium, FontWeight.Bold)
)

val vazir = FontFamily(
    Font(R.font.vazir),
    Font(R.font.vazirmedium, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = vazir,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        textDirection = TextDirection.Rtl
    ),
    h1 = TextStyle(
        fontFamily = vazir,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        textDirection = TextDirection.Rtl
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)