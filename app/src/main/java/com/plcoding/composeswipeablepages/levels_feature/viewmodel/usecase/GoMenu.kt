package com.plcoding.composeswipeablepages.levels_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.common.navigate.Screen

object GoMenu {
    fun excute(){
        MainActivity.navController.navigate(Screen.Menu.route)
    }
}