package com.plcoding.composeswipeablepages.menu_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.common.navigate.Screen

object PressGameUsecase {

    fun ecxute(){
        MainActivity.navController.navigate(Screen.Levels.route)
    }
}