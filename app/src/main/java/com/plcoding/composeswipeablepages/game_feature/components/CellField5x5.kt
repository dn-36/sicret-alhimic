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
fun CellField5x5(
    listCell:List<ModelCell>,
    clickCell:(ModelCell) -> Unit
){
    Column(
        modifier = Modifier.padding(bottom = 70.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
            Row(horizontalArrangement = Arrangement.SpaceAround
            ) {
                    Cell( height = 80,
                        width = 60,
                        img = listCell[0].img,
                        stateCell = listCell[0].stateCell,
                        clickCell = {clickCell(listCell[0])}
                    )

                Cell( height = 80,
                    width = 60,
                    img = listCell[1].img,
                    stateCell = listCell[1].stateCell,
                    clickCell = {clickCell(listCell[1])}
                )

                    Cell( height = 80,
                        width = 60,
                        img = listCell[2].img,
                        stateCell = listCell[2].stateCell,
                        clickCell = {clickCell(listCell[2])}
                    )
                    Cell( height = 80,
                        width = 60,
                        img = listCell[3].img,
                        stateCell = listCell[3].stateCell,
                        clickCell = {clickCell(listCell[3])}
                    )
                    Cell( height = 80,
                        width = 60,
                        img = listCell[4].img,
                        stateCell = listCell[4].stateCell,
                        clickCell = {clickCell(listCell[4])}
                    )
        }
        Row(horizontalArrangement = Arrangement.SpaceAround
        ) {
            Cell( height = 80,
                width = 60,
                img = listCell[5].img,
                stateCell = listCell[5].stateCell,
                clickCell = {clickCell(listCell[5])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[6].img,
                stateCell = listCell[6].stateCell,
                clickCell = {clickCell(listCell[6])}
            )

            Cell( height = 80,
                width = 60,
                img = listCell[7].img,
                stateCell = listCell[7].stateCell,
                clickCell = {clickCell(listCell[7])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[8].img,
                stateCell = listCell[8].stateCell,
                clickCell = {clickCell(listCell[8])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[9].img,
                stateCell = listCell[9].stateCell,
                clickCell = {clickCell(listCell[9])}
            )
        }
        Row(horizontalArrangement = Arrangement.SpaceAround
        ) {
            Cell( height = 80,
                width = 60,
                img = listCell[10].img,
                stateCell = listCell[10].stateCell,
                clickCell = {clickCell(listCell[10])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[11].img,
                stateCell = listCell[11].stateCell,
                clickCell = {clickCell(listCell[11])}
            )

            Cell( height = 80,
                width = 60,
                img = listCell[12].img,
                stateCell = listCell[12].stateCell,
                clickCell = {clickCell(listCell[12])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[13].img,
                stateCell = listCell[13].stateCell,
                clickCell = {clickCell(listCell[13])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[14].img,
                stateCell = listCell[14].stateCell,
                clickCell = {clickCell(listCell[14])}
            )
        }
        Row(horizontalArrangement = Arrangement.SpaceAround
        ) {
            Cell( height = 80,
                width = 60,
                img = listCell[15].img,
                stateCell = listCell[15].stateCell,
                clickCell = {clickCell(listCell[15])}
            )

            Cell( height = 80,
                width = 60,
                img = listCell[16].img,
                stateCell = listCell[16].stateCell,
                clickCell = {clickCell(listCell[16])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[17].img,
                stateCell = listCell[17].stateCell,
                clickCell = {clickCell(listCell[17])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[18].img,
                stateCell = listCell[18].stateCell,
                clickCell = {clickCell(listCell[18])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[19].img,
                stateCell = listCell[19].stateCell,
                clickCell = {clickCell(listCell[19])}
            )
        }
        Row(horizontalArrangement = Arrangement.SpaceAround
        ) {
            Cell( height = 80,
                width = 60,
                img = listCell[20].img,
                stateCell = listCell[20].stateCell,
                clickCell = {clickCell(listCell[20])}
            )

            Cell( height = 80,
                width = 60,
                img = listCell[21].img,
                stateCell = listCell[21].stateCell,
                clickCell = {clickCell(listCell[21])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[22].img,
                stateCell = listCell[22].stateCell,
                clickCell = {clickCell(listCell[22])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[23].img,
                stateCell = listCell[23].stateCell,
                clickCell = {clickCell(listCell[23])}
            )
            Cell( height = 80,
                width = 60,
                img = listCell[24].img,
                stateCell = listCell[24].stateCell,
                clickCell = {clickCell(listCell[24])}
            )
        }
    }
}