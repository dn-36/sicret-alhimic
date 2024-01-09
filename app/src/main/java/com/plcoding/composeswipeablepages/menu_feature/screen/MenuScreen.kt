package com.plcoding.composeswipeablepages.menu_feature.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.menu_feature.viewmodel.event.IntentMenu
import com.plcoding.composeswipeablepages.menu_feature.viewmodel.viewmodel.ViewModelMenu

@Preview
@Composable
fun ShowMenu(){
    MenuScreen.Content()
}
object MenuScreen{
val vmMenu = ViewModelMenu()
@Composable
fun Content(){

    Image(painter = painterResource(id = R.drawable.menu_backgraund), contentDescription =null,
        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.levels_button), contentDescription =null,
        modifier = Modifier.padding(bottom = 250.dp).fillMaxWidth(0.7f).fillMaxHeight(0.15f)
            .clickable { vmMenu.processIntent(IntentMenu.MenuGame)})
        Image(painter = painterResource(id = R.drawable.shop_button), contentDescription =null,
        modifier = Modifier.fillMaxWidth(0.7f).fillMaxHeight(0.15f)
            .clickable { vmMenu.processIntent(IntentMenu.MenuShop)})
    }
}}