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
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ModelCell

@Composable
fun CellField3x3(
    listCell:List<ModelCell>,
    clickCell:(ModelCell) -> Unit
){
    Column(
        modifier = Modifier.padding(bottom = 70.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
            Row(horizontalArrangement = Arrangement.SpaceAround
            ) {
                Cell( height = 140,
                    width = 110,
                    img = listCell[0].img,
                    stateCell = listCell[0].stateCell,
                    clickCell = {clickCell(listCell[0])}
                )
                Cell( height = 140,
                    width = 110,
                    img = listCell[1].img,
                    stateCell = listCell[1].stateCell,
                    clickCell = {clickCell(listCell[1])}
                )
                Cell( height = 140,
                    width = 110,
                    img = listCell[2].img,
                    stateCell = listCell[2].stateCell,
                    clickCell = {clickCell(listCell[2])}
                )
                    }
        Row(horizontalArrangement = Arrangement.SpaceAround
        ) {
            Cell( height = 140,
                width = 110,
                img = listCell[3].img,
                stateCell = listCell[3].stateCell,
                clickCell = {clickCell(listCell[3])}
            )
            Cell( height = 140,
                width = 110,
                img = listCell[4].img,
                stateCell = listCell[4].stateCell,
                clickCell = {clickCell(listCell[4])}
            )
            Cell( height = 140,
                width = 110,
                img = listCell[5].img,
                stateCell = listCell[5].stateCell,
                clickCell = {clickCell(listCell[5])}
            )
        }

        Row(horizontalArrangement = Arrangement.SpaceAround
        ) {
            Cell( height = 140,
                width = 110,
                img = listCell[6].img,
                stateCell = listCell[6].stateCell,
                clickCell = {clickCell(listCell[6])}
            )
            Cell( height = 140,
                width = 110,
                img = listCell[7].img,
                stateCell = listCell[7].stateCell,
                clickCell = {clickCell(listCell[7])}
            )
            Cell( height = 140,
                width = 110,
                img = listCell[8].img,
                stateCell = listCell[8].stateCell,
                clickCell = {clickCell(listCell[8])}
            )
        }

        }}


