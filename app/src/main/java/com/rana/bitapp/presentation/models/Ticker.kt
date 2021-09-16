package com.rana.bitapp.presentation.models

import com.rana.bitapp.domain.model.TickerDTO

data class Ticker(
    val channelId: String = "",
    val bid: String = "",
    val bidSize: String = "",
    val ask: String = "",
    val askSize: String = "",
    val dailyChange: String = "",
    val dailyChangePerc: String = "",
    val lastPrice: String = "",
    val volume: String = "",
    val high: String = "",
    val low: String = ""
)

fun TickerDTO.toTicker() = Ticker(
    channelId = channelId,
    bid = bid,
    bidSize = bidSize,
    ask = ask,
    askSize = askSize,
    dailyChange = dailyChange,
    dailyChangePerc = dailyChangePerc,
    lastPrice = lastPrice,
    volume = volume,
    high = high,
    low = low
)