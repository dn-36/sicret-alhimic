package com.plcoding.composeswipeablepages.game_feature.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plcoding.composeswipeablepages.R


@Composable
fun CellField5x5(){
    Column(
        modifier = Modifier.padding(bottom = 70.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        for (i in 1 ..5 ){
            Row(horizontalArrangement = Arrangement.SpaceAround
            ) {
                for (i in 1..5) {
                    Card(
                        modifier = Modifier.padding(4.dp),
                        RoundedCornerShape(0f)
                    ) {
                        Image(painter = painterResource(id = R.drawable.card_defaults), contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(60.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                }

            }
        }}

}