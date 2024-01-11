package com.plcoding.composeswipeablepages.game_feature.viewmodel

sealed class GameIntent{
    data class PressCell(val cell:Cell): GameIntent()
    object setField:GameIntent()
  //  object Stop: GameIntent()

  //  object Exit: GameIntent()

}
