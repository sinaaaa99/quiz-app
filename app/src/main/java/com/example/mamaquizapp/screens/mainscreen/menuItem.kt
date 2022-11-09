package com.example.mamaquizapp.screens.mainscreen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mamaquizapp.data.model.MenusClass
import com.example.mamaquizapp.ui.theme.Blue
import com.example.mamaquizapp.utility.standardQuadFromTO

@Composable
fun menuItem(
    menuItem: MenusClass,
    startClickListener: () -> Unit
) {


    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(menuItem.darkColor)
    ) {

        val width = constraints.maxWidth
        val height = constraints.maxHeight

        //mediumColor Path
        val mediumColorPoint1 = Offset(0f, 0.3f * height)
        val mediumColorPoint2 = Offset(0.1f * width, 0.35f * height)
        val mediumColorPoint3 = Offset(0.4f * width, 0.05f * height)
        val mediumColorPoint4 = Offset(0.75f * width, 0.7f * height)
        val mediumColorPoint5 = Offset(1.4f * width, -height.toFloat())

        val mediumColorPath = Path().apply {

            moveTo(mediumColorPoint1.x, mediumColorPoint1.y)

            standardQuadFromTO(mediumColorPoint1, mediumColorPoint2)
            standardQuadFromTO(mediumColorPoint2, mediumColorPoint3)
            standardQuadFromTO(mediumColorPoint3, mediumColorPoint4)
            standardQuadFromTO(mediumColorPoint4, mediumColorPoint5)

            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        //lightColor Path
        val lightColorPoint1 = Offset(0f, 0.35f * height)
        val lightColorPoint2 = Offset(0.1f * width, 0.4f * height)
        val lightColorPoint3 = Offset(0.3f * width, 0.35f * height)
        val lightColorPoint4 = Offset(0.65f * width, height.toFloat())
        val lightColorPoint5 = Offset(1.4f * width, -height.toFloat() / 3f)

        val lightColorPath = Path().apply {

            moveTo(lightColorPoint1.x, lightColorPoint1.y)

            standardQuadFromTO(lightColorPoint1, lightColorPoint2)
            standardQuadFromTO(lightColorPoint2, lightColorPoint3)
            standardQuadFromTO(lightColorPoint3, lightColorPoint4)
            standardQuadFromTO(lightColorPoint4, lightColorPoint5)

            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        Canvas(modifier = Modifier.fillMaxSize()) {

            drawPath(path = mediumColorPath, color = menuItem.mediumColor)
            drawPath(path = lightColorPath, color = menuItem.lightColor)
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {

            Text(
                text = menuItem.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopEnd),
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.h6,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "شروع",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .clickable {

                        startClickListener()


                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Blue)
                    .padding(vertical = 10.dp, horizontal = 20.dp)

            )

            Icon(
                painter = painterResource(id = menuItem.icon),
                contentDescription = menuItem.title,
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .height(35.dp)
                    .width(30.dp)
            )


        }


    }
}