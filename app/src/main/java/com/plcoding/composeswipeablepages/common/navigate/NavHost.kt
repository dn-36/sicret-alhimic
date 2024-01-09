package com.plcoding.composeswipeablepages.common.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.shop_feature.screen.ShopScreen
import com.plcoding.composeswipeablepages.game_feature.screen.GameScreen
import com.plcoding.composeswipeablepages.levels_feature.screen.LevelsScreen
import com.plcoding.composeswipeablepages.loading_feature.screen.LoadingScreen
import com.plcoding.composeswipeablepages.menu_feature.screen.MenuScreen

@Composable
fun navigate (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Loading.route){
        composable(Screen.Loading.route){
            MainActivity.navController =navController
            LoadingScreen.Content()
        }
        composable(Screen.Menu.route){
            MenuScreen.Content()
        }
        composable(Screen.Shop.route){
           ShopScreen.Content()
        }
        composable(Screen.Game.route){
           GameScreen.Content()
        }
        composable(Screen.Levels.route){
          LevelsScreen.Content()
        }

    }
}
