package com.plcoding.composeswipeablepages.game_feature.viewmodel

import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.common.SizeField

data class GameState(
    val fieldSize:SizeField,
    val listCells:List<ModelCell> = listOf(
        ModelCell(img = R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,index =0),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =1),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,  index =2),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,  index =3),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,  index =4),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one, index = 5),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one, index = 6),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =7),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,  index =8),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,  index =9),
        ModelCell(img =R.drawable.card_defaults, stateCell = StateCell.StartCheckCell_one,  index =10),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =11),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =12),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =13),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =14),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one,index =15),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one,index =16),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =17),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one,index =18),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =19),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =20),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =21),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =22),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =23),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =24),
        ModelCell(img =R.drawable.card_defaults,  stateCell = StateCell.StartCheckCell_one, index =25),

        )

)
