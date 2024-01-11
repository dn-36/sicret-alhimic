package com.plcoding.composeswipeablepages.levels_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.SizeField
import com.plcoding.composeswipeablepages.common.navigate.Screen

object ChoiceLevelsUseCase {
    fun excute(index:Int){
        ChangeDateApp.clickedIndexLevel=index
        if(index in  0..3) {
            ChangeDateApp.sizeFieldNow = SizeField.Size2x2
        }else if(index in 4..9){
            ChangeDateApp.sizeFieldNow = SizeField.Size3x3
        }
        else if(index in 10..19){
            ChangeDateApp.sizeFieldNow = SizeField.Size4x4
        }
        else if (index in 20..29){ ChangeDateApp.sizeFieldNow = SizeField.Size5x5}

        MainActivity.navController.navigate(Screen.Game.route)
    }
}