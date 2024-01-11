package com.plcoding.composeswipeablepages.levels_feature.viewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.plcoding.composeswipeablepages.levels_feature.viewmodel.event.IntentLevels
import com.plcoding.composeswipeablepages.levels_feature.viewmodel.usecase.ChoiceLevelsUseCase
import com.plcoding.composeswipeablepages.levels_feature.viewmodel.usecase.GoMenu

class ViewModelLevels(): ViewModel() {
fun processIntent(event:IntentLevels){
    when(event){
        is IntentLevels.ChoiceLevel -> {ChoiceLevelsUseCase.excute(event.indexLevel)}
        is IntentLevels.goMenu->{GoMenu.excute()}
    }
}
}