package com.plcoding.composeswipeablepages.menu_feature.viewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.plcoding.composeswipeablepages.menu_feature.viewmodel.event.IntentMenu
import com.plcoding.composeswipeablepages.menu_feature.viewmodel.usecase.PressGameUsecase
import com.plcoding.composeswipeablepages.menu_feature.viewmodel.usecase.PressShopUsecase

class ViewModelMenu: ViewModel() {

    fun processIntent(intent: IntentMenu){
        when(intent){
            IntentMenu.MenuShop->{
               PressShopUsecase.excute()}
            IntentMenu.MenuGame->{
                PressGameUsecase.ecxute()}
        }
    }

}