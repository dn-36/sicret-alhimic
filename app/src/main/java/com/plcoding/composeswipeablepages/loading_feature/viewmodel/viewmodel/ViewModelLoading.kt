package com.plcoding.composeswipeablepages.loading_feature.viewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.plcoding.composeswipeablepages.loading_feature.viewmodel.events.IntentLoading
import com.plcoding.composeswipeablepages.loading_feature.viewmodel.useCase.GoToMenuUseCase

class ViewModelLoading:ViewModel() {


    fun processIntent(intent: IntentLoading){
        when(intent){
            IntentLoading.ShowLoading->{
                GoToMenuUseCase.excute()}
        }
    }
}