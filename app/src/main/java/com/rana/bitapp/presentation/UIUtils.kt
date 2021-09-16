package com.rana.bitapp.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun getPercentageChange(dailyChangePerc: String): String {
    return (
            if (dailyChangePerc.toDouble() > 0)
                "+$dailyChangePerc"
            else
                dailyChangePerc
            ) + "%"
}

@Composable
fun getTitle(channelId: String): String {

    return channelId
        .takeIf { it.length >= 6 }
        ?.let {
            it.substring(1, 4) + "/" + it.substring(4, it.length)
        } ?: ""
}

@Composable
fun getPriceColor(dailyChangePerc: String): Color {
    return if (dailyChangePerc.toDouble() > 0) Color.Green else Color.Red
}