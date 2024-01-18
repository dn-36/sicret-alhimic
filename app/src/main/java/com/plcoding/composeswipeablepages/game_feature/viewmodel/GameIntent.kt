package com.plcoding.composeswipeablepages.game_feature.viewmodel

sealed class GameIntent{
    data class PressCell(val cell:ModelCell): GameIntent()
    object setField:GameIntent()
    object PressHintPotion:GameIntent()
    object PressHintBook:GameIntent()
  //  object Stop: GameIntent()

  //  object Exit: GameIntent()

}
