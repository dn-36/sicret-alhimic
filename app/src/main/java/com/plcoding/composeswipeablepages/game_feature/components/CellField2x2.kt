package com.plcoding.composeswipeablepages.game_feature.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ModelCell


@Preview
@Composable
fun Show(){
   // CellField2x2()
}

@Composable
fun CellField2x2(listCell:List<ModelCell>,clickCell:(ModelCell)->Unit) {
    Column(
        modifier = Modifier.padding(bottom = 70.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {

            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Cell(
                    height = 160,
                    width = 130,
                    img = listCell[0].img,
                    stateCell = listCell[0].stateCell,
                    clickCell = {clickCell(listCell[0])}
                )
                Cell(
                    height = 160,
                    width = 130,
                    img = listCell[1].img,
                    stateCell = listCell[1].stateCell,
                    clickCell = {clickCell(listCell[1])}
                )

                }

            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Cell( height = 160,
                    width = 130,
                    img = listCell[2].img,
                    stateCell = listCell[2].stateCell,
                    clickCell = {clickCell(listCell[2])}
                )
                Cell( height = 160,
                    width = 130,
                    img = listCell[3].img,
                    stateCell = listCell[3].stateCell,
                    clickCell = {clickCell(listCell[3])}
                )

            }

        }
    }

