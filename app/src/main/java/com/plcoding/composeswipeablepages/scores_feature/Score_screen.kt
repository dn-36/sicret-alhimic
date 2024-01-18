package com.plcoding.composeswipeablepages.scores_feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.levels_feature.screen.LevelsScreen
import com.plcoding.composeswipeablepages.levels_feature.viewmodel.event.IntentLevels

@Preview
@Composable
fun Show(){
Score_screen.Content()
}
object Score_screen {

    @Composable
    fun Content(){
        Image(
            painter = painterResource(id = R.drawable.backgraund_score), contentDescription = null,
            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds
        )
        Image(painter = painterResource(id = R.drawable.back_button), contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(0.2f)
                .padding(top = 40.dp, start = 20.dp)
                .clickable {})
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = "13", fontSize = 80.sp
            , fontWeight = FontWeight.Bold
            , color = Color.White
            , modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 200.dp))
            Text(text = "Всего очков : 33", fontSize = 30.sp
                , fontWeight = FontWeight.Bold
                , color = Color.White
                , modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 320.dp))
            Column(modifier = Modifier.
            align(Alignment.CenterStart)
                .padding(start=40.dp, top = 350.dp),
            verticalArrangement = Arrangement.SpaceAround) {
                Text(text = "1.Иван", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
                Text(text = "2.Маша", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
                Text(text = "3.Петя", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
                Text(text = "4.Костя", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
            }
            Column(modifier = Modifier.
            align(Alignment.CenterEnd)
                .padding(end=40.dp, top = 350.dp),
                verticalArrangement = Arrangement.SpaceAround) {
                Text(text = "77", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
                Text(text = "39", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
                Text(text = "27", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
                Text(text = "20", fontSize = 40.sp
                    , fontWeight = FontWeight.Bold
                    , color = Color.White)
            }
        }
    }
}