package com.plcoding.composeswipeablepages.game_feature.viewmodel

import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.SizeField

data class GameState(
    var fieldSize:SizeField = SizeField.Size2x2,
    var listCells:List<Cell> = listOf(
        Cell(img = R.drawable.card_defaults, index =0),
        Cell(img =R.drawable.card_defaults,  index =1),
        Cell(img =R.drawable.card_defaults,  index =2),
        Cell(img =R.drawable.card_defaults,  index =3),
        Cell(img =R.drawable.card_defaults,  index =4),
        Cell(img =R.drawable.card_defaults, index = 5),
        Cell(img =R.drawable.card_defaults, index = 6),
        Cell(img =R.drawable.card_defaults,  index =7),
        Cell(img =R.drawable.card_defaults,  index =8),
        Cell(img =R.drawable.card_defaults,  index =9),
        Cell(img =R.drawable.card_defaults,  index =10),
        Cell(img =R.drawable.card_defaults,  index =11),
        Cell(img =R.drawable.card_defaults,  index =12),
        Cell(img =R.drawable.card_defaults,  index =13),
        Cell(img =R.drawable.card_defaults,  index =14),
        Cell(img =R.drawable.card_defaults,  index =15),
        Cell(img =R.drawable.card_defaults,  index =16),
        Cell(img =R.drawable.card_defaults,  index =17),
        Cell(img =R.drawable.card_defaults,  index =18),
        Cell(img =R.drawable.card_defaults,  index =19),
        Cell(img =R.drawable.card_defaults,  index =20),
        Cell(img =R.drawable.card_defaults,  index =21),
        Cell(img =R.drawable.card_defaults,  index =22),
        Cell(img =R.drawable.card_defaults,  index =23),
        Cell(img =R.drawable.card_defaults,  index =24),
        Cell(img =R.drawable.card_defaults,  index =25),

        )

)
