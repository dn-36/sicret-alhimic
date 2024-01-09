package com.plcoding.composeswipeablepages.shop_feature.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.composeswipeablepages.MainActivity
import com.plcoding.composeswipeablepages.R
import com.plcoding.composeswipeablepages.common.navigate.Screen

@Preview
@Composable
fun ShowShopScreen(){
    ShopScreen.Content()
}
@OptIn(ExperimentalFoundationApi::class)
object ShopScreen {
@Composable
fun Content(){
    val pager = listOf(
        R.drawable.book_magic,
        R.drawable.lucky_potion,
        R.drawable.lucky_potion_yellow,
        R.drawable.magic_hat
    )
    val pagerState = rememberPagerState()

    Image(painter = painterResource(id = R.drawable.shop_backgraund), contentDescription = null,
        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
    Image(painter = painterResource(id = R.drawable.back_button), contentDescription =null ,
        modifier = Modifier
            .fillMaxWidth(0.2f)
            .padding(top = 40.dp, start = 20.dp).clickable {   MainActivity.navController.navigate(
                Screen.Menu.route) })
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.buy_button), contentDescription =null ,
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .align(Alignment.BottomCenter)
            .padding(bottom = 60.dp))
        Box(modifier = Modifier.padding(bottom = 100.dp).width(280.dp).height(350.dp).
        align(Alignment.Center)) {
            HorizontalPager(
                pageCount = pager.size,
                state = pagerState,
                key = { pager[it] },
                pageSize = PageSize.Fill
            ) { index ->
                Image(
                    painter = painterResource(id = pager[index]),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}}