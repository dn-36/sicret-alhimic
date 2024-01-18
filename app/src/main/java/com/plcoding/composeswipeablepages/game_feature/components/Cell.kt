package com.plcoding.composeswipeablepages.game_feature.components

import android.util.Log
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.game_feature.viewmodel.StateCell
import kotlinx.coroutines.delay

@Composable
fun Cell(
    img: Int,
    height:Int,
    width:Int,
    stateCell: StateCell,
    clickCell:()->Unit
    ) {
    var _img by remember {
        mutableStateOf(img)
    }
    val Yrotate = remember { Animatable(initialValue =360f) }

    var alpha by remember {
        mutableStateOf(1f)
    }


    when (stateCell) {
        StateCell.StartCheckCell_one -> {
           // _img = img
alpha = 1f
            LaunchedEffect(true) {
                delay(1000L)
                _img = R.drawable.card_defaults
                Yrotate.animateTo(
                    targetValue = 180f,
                    animationSpec = tween(durationMillis = 500)
                )
            }
        }
        StateCell.StartCheckCell_two -> {
            // _img = img
            alpha = 1f

            LaunchedEffect(true) {
                delay(1000L)
                _img = R.drawable.card_defaults
                Yrotate.animateTo(
                    targetValue = 180f,
                    animationSpec = tween(durationMillis = 500)
                )
            }
        }

        StateCell.FirstClick -> {
            Log.d("test_01_fist","")
            _img = img
            LaunchedEffect(true) {
                Yrotate.animateTo(
                    targetValue = 0f,
                    animationSpec = tween(durationMillis = 500)
                )

            }

        }

        StateCell.HintPotion_one -> {

            LaunchedEffect(true){
                delay(200L)
                _img = img
                delay(1500L)
                _img = R.drawable.card_defaults
            }

            LaunchedEffect(true) {
                Yrotate.animateTo(
                    targetValue = 0f,
                    animationSpec = tween(durationMillis = 500)
                )


                delay(1000L)
                Yrotate.animateTo(
                    targetValue = 180f,
                    animationSpec = tween(durationMillis = 500)
                )
              //  delay(1180L)


            }
        }

        StateCell.HintPotion_two -> {

            LaunchedEffect(true){
                delay(200L)
                _img = img
                delay(1500L)
                _img = R.drawable.card_defaults
            }

            LaunchedEffect(true) {
                Yrotate.animateTo(
                    targetValue = 0f,
                    animationSpec = tween(durationMillis = 500)
                )


                delay(1000L)
                Yrotate.animateTo(
                    targetValue = 180f,
                    animationSpec = tween(durationMillis = 500)
                )
                //  delay(1180L)


            }
        }

        StateCell.Different_one -> {
            Log.d("test_01_deirent","")

            LaunchedEffect(true) {

                _img = img
                Yrotate.animateTo(
                    targetValue = 0f,
                    animationSpec = tween(durationMillis = 500)
                )

                delay(700)
                _img = R.drawable.card_defaults
                Yrotate.animateTo(
                    targetValue = 180f,
                    animationSpec = tween(durationMillis = 500)
                )

            }
        }

        StateCell.Different_two -> {
            Log.d("test_01_deirent","")

            LaunchedEffect(true) {

                _img = img
                Yrotate.animateTo(
                    targetValue = 0f,
                    animationSpec = tween(durationMillis = 500)
                )

                delay(700)
                _img = R.drawable.card_defaults
                Yrotate.animateTo(
                    targetValue = 180f,
                    animationSpec = tween(durationMillis = 500)
                )

            }
        }

        StateCell.Coincidence -> {
            LaunchedEffect(true) {

                _img = img
                Yrotate.animateTo(
                    targetValue = 0f,
                    animationSpec = tween(durationMillis = 500)
                )

                delay(700)
                alpha = 0f
            }

            }
    }


        Image(
            painter = painterResource(id = _img),
            contentDescription = null,
            modifier = Modifier
                .height(height.dp)
                .width(width = width.dp)
                .padding(5.dp)
                .alpha(alpha = alpha)
                .graphicsLayer {
                    rotationY = Yrotate.value
                }
                .clickable {
                    clickCell()
                },
            contentScale = ContentScale.FillBounds
        )

    }

