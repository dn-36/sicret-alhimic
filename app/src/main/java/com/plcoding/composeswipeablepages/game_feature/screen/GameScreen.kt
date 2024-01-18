package com.plcoding.composeswipeablepages.game_feature.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.common.ChangeDateApp
import com.plcoding.composeswipeablepages.common.SizeField
import com.plcoding.composeswipeablepages.common.listLevels
import com.plcoding.composeswipeablepages.common.navigate.Screen
import com.plcoding.composeswipeablepages.game_feature.components.CellField2x2
import com.plcoding.composeswipeablepages.game_feature.components.CellField3x3
import com.plcoding.composeswipeablepages.game_feature.components.CellField4x4
import com.plcoding.composeswipeablepages.game_feature.components.CellField5x5
import com.plcoding.composeswipeablepages.game_feature.viewmodel.GameIntent
import com.plcoding.composeswipeablepages.game_feature.viewmodel.ViewModelGame

@Preview
@Composable
fun ShowGame(){
    GameScreen.Content()
}
object GameScreen{

    val vm = ViewModelGame()
@Composable
fun Content(){

vm.processIntent(GameIntent.setField)

Image(painter = painterResource(id = R.drawable.game_backgraund), contentDescription =null,
modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.back_button), contentDescription = null,
            modifier = Modifier
                .padding(top = 30.dp, start = 8.dp)
                .height(40.dp)
                .width(70.dp)
                .clickable { MainActivity.navController.navigate(Screen.Levels.route) })

        Row(modifier = Modifier
            .fillMaxWidth(0.6f)
            .padding(top = 20.dp)
            .align(Alignment.TopEnd), horizontalArrangement = Arrangement.SpaceAround,
        ) {

            Image(painter = painterResource(id = R.drawable.health), contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(90.dp))
            Image(painter = painterResource(id = R.drawable.bonus), contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(90.dp))
        }



        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .align(Alignment.BottomCenter)
            .padding(bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround) {
            Row(modifier = Modifier
                .width(200.dp),
                horizontalArrangement = Arrangement.SpaceAround){
                Image(painter = painterResource(id = R.drawable.lucky_potion_empty), contentDescription = null,
                    modifier = Modifier.height(90.dp).width(60.dp)
                        .clickable { vm.processIntent(GameIntent.PressHintPotion) })
                Image(painter = painterResource(id = R.drawable.magic_book_empty), contentDescription = null,
                    modifier = Modifier.height(90.dp).width(60.dp)
                        .clickable { vm.processIntent(GameIntent.PressHintBook) })
            }
            Image(painter = painterResource(id = R.drawable.stop_button), contentDescription = null,
            modifier = Modifier.fillMaxWidth(0.6f))
            Image(painter = painterResource(id = R.drawable.exit_button), contentDescription = null,
                modifier = Modifier.fillMaxWidth(0.6f))
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .align(Alignment.Center),
            contentAlignment = Alignment.Center) {



           when(ViewModelGame.gameState.fieldSize) {
                SizeField.Size2x2 ->     CellField2x2(
                    ViewModelGame.gameState.listCells,
                    {cell ->vm.processIntent(GameIntent.PressCell(cell))}
                )
                SizeField.Size3x3 ->  CellField3x3(
                    ViewModelGame.gameState.listCells,
                    {cell ->vm.processIntent(GameIntent.PressCell(cell))}
                )
                SizeField.Size4x4 ->  CellField4x4(
                    ViewModelGame.gameState.listCells,
                    {cell ->vm.processIntent(GameIntent.PressCell(cell))}
                )
                SizeField.Size5x5 ->  CellField5x5(
                    ViewModelGame.gameState.listCells,
                    {cell ->vm.processIntent(GameIntent.PressCell(cell))}
                )

            }

            Text(
                text = "Level ${ChangeDateApp.clickedIndexLevel +1}",
                fontSize = 41.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .wrapContentSize()
                    .alpha(1F)
                    .offset(y = -280.dp)
                    .padding(bottom = 40.dp)
            )

            Text(
                text = "Level ${ChangeDateApp.clickedIndexLevel +1}",
                fontSize = 41.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .wrapContentSize()
                    .alpha(1F)
                    .offset(y = -280.dp)
                    .padding(bottom = 40.dp)
            )

        }
   }
    }

}