package com.plcoding.composeswipeablepages.game_feature.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.game_feature.viewmodel.Cell
import com.plcoding.composeswipeablepages.game_feature.viewmodel.GameIntent
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ViewModelGame

@Preview
@Composable
fun Show(){
   // CellField2x2()
}

@Composable
fun CellField2x2(listCell:List<Cell>) {
    var vm=ViewModelGame()
    Column(
        modifier = Modifier.padding(bottom = 70.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        for (i in 1..2) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                for (n in 1..2) {
                    val index = i * 2 + n

                    Card(
                        modifier = Modifier.padding(4.dp),
                        RoundedCornerShape(0f)
                    ) {
                        Image(
                            painter = painterResource(id = listCell[index].img ),
                            contentDescription = null,
                            modifier = Modifier
                                .height(150.dp)
                                .width(120.dp)
                                .clickable {
                    vm.processIntent(GameIntent.PressCell( listCell[index]))
                                },
                            contentScale = ContentScale.FillBounds
                        )
                    }

                }

            }
        }
    }

}