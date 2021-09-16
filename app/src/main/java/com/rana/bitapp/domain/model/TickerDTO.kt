package com.rana.bitapp.domain.model

data class TickerDTO(
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
