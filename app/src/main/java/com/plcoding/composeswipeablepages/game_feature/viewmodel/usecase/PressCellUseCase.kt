package com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.listLevels
import com.plcoding.composeswipeablepages.game_feature.viewmodel.Cell
import com.plcoding.composeswipeablepages.game_feature.viewmodel.GameState
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ViewModelGame

object PressCellUseCase {
    fun excute(cell: Cell) {
        if (cell.img != R.drawable.card_defaults) {
            return
        }
       // if (ChangeDateApp.firstMoveCell == null) {
            FirstPress(cell)
      //  } else {
       //     SecondPress(cell)
      //  }
    }

    private fun FirstPress(cell: Cell) {

        //присваивою переменной актуальное состояния ameState
        val _listCell = ViewModelGame.gameState.listCells.toMutableList()

        var listImg = listLevels[ChangeDateApp.clickedIndexLevel]

        _listCell[cell.index] =
            Cell(
                img = listImg[cell.index],
                index = cell.index
            )

    ViewModelGame.gameState = GameState(listCells = _listCell)
    ChangeDateApp.firstMoveCell = cell

}

    private fun SecondPress(cell:Cell){
        if(cell.img == R.drawable.card_game_hat ||
                cell.img == R.drawable.card_game_potion ||
                cell.img == R.drawable.game_card_book  ){
            return
        }

        val _listCell = ViewModelGame.gameState.listCells.toMutableList()


        _listCell[cell.index] =
            Cell(
                index =cell.index,
                img = ChangeDateApp.firstMoveCell!!.img,

            )
        ViewModelGame.gameState = GameState(listCells = _listCell)
        ChangeDateApp.firstMoveCell = null

    }
}