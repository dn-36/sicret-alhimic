package com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.listLevels
import com.plcoding.composeswipeablepages.game_feature.viewmodel.GameState
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ModelCell
import com.plcoding.composeswipeablepages.game_feature.viewmodel.StateCell
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ViewModelGame

object PressHintPotionUseCase {
  fun excute() {
    val _listCell = ViewModelGame.gameState.listCells.toMutableList()

    _listCell.forEachIndexed { index, modelCell ->
      if(modelCell.stateCell == StateCell.HintPotion_one){

        _listCell[index] = modelCell.copy(stateCell = StateCell.HintPotion_two)


      }else{
        _listCell[index] = modelCell.copy(stateCell = StateCell.HintPotion_one)
      }

    }
    ViewModelGame.gameState = GameState(
      listCells = _listCell,
      fieldSize = ChangeDateApp.sizeFieldNow
    )

  }
}