package com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase

import android.util.Log
import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.listLevels
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ModelCell
import com.plcoding.composeswipeablepages.game_feature.viewmodel.GameState
import com.plcoding.composeswipeablepages.game_feature.viewmodel.StateCell
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ViewModelGame
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object PressCellUseCase {
    fun excute(cell: ModelCell) {

        Log.d("test_01", cell.toString())

        if (cell.alpha != 1F) {
            return
        }
        if (ChangeDateApp.firstMoveCell == null) {
            FirstPress(cell)
        } else {
            SecondPress(cell)
        }
    }

    private fun FirstPress(cell: ModelCell) {

        ChangeDateApp.firstMoveCell = cell


        val _listCell = ViewModelGame.gameState.listCells.toMutableList()

        var listImg = listLevels[ChangeDateApp.clickedIndexLevel]

        _listCell[cell.index] =
            ModelCell(
                img = listImg[cell.index].img,
                index = cell.index,
                stateCell = StateCell.FirstClick
            )

        ViewModelGame.gameState = GameState(
            fieldSize = ChangeDateApp.sizeFieldNow,
            listCells = _listCell
        )

    }

    private fun SecondPress(cell: ModelCell) {

        CoroutineScope(Dispatchers.Main).launch {
            val _listCell = ViewModelGame.gameState.listCells.toMutableList()

            var listImg = listLevels[ChangeDateApp.clickedIndexLevel]



            if (ChangeDateApp.firstMoveCell!!.img == cell.img) {

                _listCell[ChangeDateApp.firstMoveCell!!.index] = ModelCell(
                    img = listImg[ChangeDateApp.firstMoveCell!!.index].img,
                    index = ChangeDateApp.firstMoveCell!!.index,
                    stateCell = StateCell.Coincidence
                )

                _listCell[cell.index] = ModelCell(
                    img = listImg[cell.index].img,
                    index = cell.index,
                    stateCell = StateCell.Coincidence
                )

                ViewModelGame.gameState = GameState(
                    listCells = _listCell,
                    fieldSize = ChangeDateApp.sizeFieldNow
                )
                  ++ChangeDateApp.numberCoincidence

            } else {

                if (
                    _listCell[cell.index].stateCell == StateCell.StartCheckCell_one ||
                    _listCell[cell.index].stateCell == StateCell.Different_two
                ) {
                    _listCell[ChangeDateApp.firstMoveCell!!.index] = ModelCell(
                        img = listImg[ChangeDateApp.firstMoveCell!!.index].img,
                        index = ChangeDateApp.firstMoveCell!!.index,
                        stateCell = StateCell.Different_one
                    )

                    _listCell[cell.index] = ModelCell(
                        img = listImg[cell.index].img,
                        index = cell.index,
                        stateCell = StateCell.Different_one
                    )
                } else {
                    _listCell[ChangeDateApp.firstMoveCell!!.index] = ModelCell(
                        img = listImg[ChangeDateApp.firstMoveCell!!.index].img,
                        index = ChangeDateApp.firstMoveCell!!.index,
                        stateCell = StateCell.Different_two
                    )

                    _listCell[cell.index] = ModelCell(
                        img = listImg[cell.index].img,
                        index = cell.index,
                        stateCell = StateCell.Different_two
                    )
                }


               ViewModelGame.gameState = GameState(
                    listCells = _listCell,
                    fieldSize = ChangeDateApp.sizeFieldNow
                )

            }
            ChangeDateApp.firstMoveCell = null

           if(ChangeDateApp.numberCoincidence==ChangeDateApp.sizeFieldNow.count){
                delay(2000L)
                ++ChangeDateApp.clickedIndexLevel
               ChangeDateApp.numberCoincidence=0
               val _listCell = ViewModelGame.gameState.listCells.toMutableList()

               _listCell.forEachIndexed { index, modelCell ->
                   if(modelCell.stateCell == StateCell.StartCheckCell_one){

                       _listCell[index] = modelCell.copy(stateCell = StateCell.StartCheckCell_two)


                   }else{
                       _listCell[index] = modelCell.copy(stateCell = StateCell.StartCheckCell_one)
                   }

               }
                ViewModelGame.gameState = GameState(
                    fieldSize = ChangeDateApp.sizeFieldNow,
                    listCells = _listCell
                )

                Log.d("testr", ViewModelGame.gameState.toString())


            }
            Log.d("testr", "${ChangeDateApp.numberCoincidence} ${ChangeDateApp.sizeFieldNow.count}")


        }
    }
}