package com.example.mamaquizapp.screens.mainscreen

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mamaquizapp.QuizActivity
import com.example.mamaquizapp.data.model.PrepopulateMenu
import com.example.mamaquizapp.ui.theme.*

@Preview(showBackground = true)
@Composable
fun MainScreen() {

    val listOfMenu = PrepopulateMenu.listOfMenu
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkcolor)
            .padding(2.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 7.5.dp, vertical = 15.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(DeepPurple)
                .padding(20.dp)
                .clickable {

                }
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(darkcolor)
                        .padding(7.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Icon name",
                        tint = Color.White
                    )
                }


                Column {
                    Text(
                        text = "نکات آموزشی",
                        style = MaterialTheme.typography.h1,
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(1.dp))
                    Text(
                        text = "پیشنهادات گایدلاین سازمان بهداشت جهانی",
                        style = MaterialTheme.typography.body1,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth()
                    )

                }

            }


        }


        Text(
            text = "آزمون ها",
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 7.5.dp, bottom = 7.5.dp),
            color = Color.White,
            style = MaterialTheme.typography.h1,
            fontSize = 22.sp,
            textAlign = TextAlign.Start
        )


        LazyVerticalGrid(columns = GridCells.Fixed(2)) {

            itemsIndexed(listOfMenu) { index, menuItem ->

                MenuItem(menuItem) {

                    val questionType = index + 1

                    val intent = Intent(context, QuizActivity::class.java)
                    intent.putExtra("questionType", questionType)
                    context.startActivity(intent)


                }


            }

        }
    }
}