package com.plcoding.composeswipeablepages.loading_feature.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.loading_feature.viewmodel.events.IntentLoading
import com.plcoding.composeswipeablepages.loading_feature.viewmodel.viewmodel.ViewModelLoading

@Preview
@Composable
fun Show(){
    LoadingScreen.Content()
}
object LoadingScreen {

    val vmLoading = ViewModelLoading()

    @Composable
    fun Content() {
           vmLoading.processIntent(IntentLoading.ShowLoading)
        Image(
            painter = painterResource(id = R.drawable.loading_backgraund),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }
}