package com.plcoding.composeswipeablepages.loading_feature.viewmodel.useCase

import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.common.navigate.Screen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object GoToMenuUseCase {


fun excute(){
   CoroutineScope(Dispatchers.Main).launch {
        delay(3000L)
        MainActivity.navController.navigate(Screen.Menu.route)
    }
}}