package com.plcoding.composeswipeablepages.game_feature.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.plcoding.composeswipeablepages.common.SizeField
import com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase.PressBookHintUseCase
import com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase.PressCellUseCase
import com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase.PressHintPotionUseCase
import com.plcoding.composeswipeablepages.game_feature.viewmodel.usecase.SetFieldUseCase

 class ViewModelGame:ViewModel() {

     companion object {
         var gameState by mutableStateOf(GameState(
             fieldSize = SizeField.Size2x2
         ))
     }



    fun processIntent(typeIntent:GameIntent){

        when(typeIntent){
            is GameIntent.PressCell -> PressCellUseCase.excute(
                typeIntent.cell
            )
            is GameIntent.setField -> SetFieldUseCase.excute()

            is GameIntent.PressHintBook -> {PressBookHintUseCase.excute()}

            is GameIntent.PressHintPotion -> {PressHintPotionUseCase.excute()}
        }

    }
}
