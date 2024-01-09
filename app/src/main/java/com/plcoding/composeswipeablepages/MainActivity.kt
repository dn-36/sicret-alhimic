package com.plcoding.composeswipeablepages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import com.plcoding.composeswipeablepages.common.navigate.navigate
import com.plcoding.composeswipeablepages.ui.theme.ComposeSwipeablePagesTheme

class MainActivity : ComponentActivity() {
    companion object{
        lateinit var navController: NavController
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSwipeablePagesTheme {
                navigate()
            }
        }
    }
}