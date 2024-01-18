package com.plcoding.composeswipeablepages.game_feature.viewmodel

import com.plcoding.composeswipeablepages.R

data class ModelCell(var index:Int,
                     var img:Int= R.drawable.card_defaults,
                     var stateCell: StateCell,
                     var alpha:Float = 1f
)

enum class StateCell{
    StartCheckCell_one,
    StartCheckCell_two,
    HintPotion_one,
    HintPotion_two,
    FirstClick,
    Coincidence,
    Different_one,
    Different_two
}
