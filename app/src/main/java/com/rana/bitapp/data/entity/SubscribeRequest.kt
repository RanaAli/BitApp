package com.rana.bitapp.data.entity

import com.rana.bitapp.domain.entity.SubscribeTicker
import com.rana.bitapp.domain.entity.SubscribeTrade
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

abstract class BaseSubscribeRequest(
    @Json(name = "event")
    open val event: String,
    @Json(name = "channel")
    open val channel: String,
    @Json(name = "symbol")
    open val symbol: String
)

@JsonClass(generateAdapter = true)
data class SubscribeTickerRequest(
    override val event: String,
    override val channel: String,
    override val symbol: String
) : BaseSubscribeRequest(event, channel, symbol)

fun SubscribeTicker.toSubscribeTickerRequest() =
    SubscribeTickerRequest(
        event = event,
        channel = channel,
        symbol = symbol
    )

@JsonClass(generateAdapter = true)
data class SubscribeTradeRequest(
    override val event: String,
    override val channel: String,
    override val symbol: String
) : BaseSubscribeRequest(event, channel, symbol)

fun SubscribeTrade.toSubscribeTradeRequest() =
    SubscribeTradeRequest(
        event = event,
        channel = channel,
        symbol = symbol
    )

@JsonClass(generateAdapter = true)
class SubscribeOrderBookRequest(
    override val event: String,
    override val channel: String,
    override val symbol: String,
    @Json(name = "freq")
    val frequency: String
) : BaseSubscribeRequest(event, channel, symbol)
