package com.plcoding.composeswipeablepages.levels_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.common.navigate.Screen

object GoBack {
    fun excute(){
        MainActivity.navController.navigate(Screen.Menu.route)
    }
}