package com.plcoding.composeswipeablepages.menu_feature.viewmodel.usecase

import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.common.navigate.Screen

object PressShopUsecase {

    fun excute(){
        MainActivity.navController.navigate(Screen.Shop.route)
    }
}