package com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.SizeField
import com.plcoding.composeswipeablepages.game_feature.viewmodel.GameState
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ViewModelGame

object SetFieldUseCase {
//
    fun excute(){
        ViewModelGame.gameState = GameState(fieldSize = ChangeDateApp.sizeFieldNow)
    }
}