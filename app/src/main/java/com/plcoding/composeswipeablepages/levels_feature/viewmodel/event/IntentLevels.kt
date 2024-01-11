package com.plcoding.composeswipeablepages.levels_feature.viewmodel.event

sealed class IntentLevels{
data class ChoiceLevel(var indexLevel:Int):IntentLevels()
    object goMenu:IntentLevels()
}
