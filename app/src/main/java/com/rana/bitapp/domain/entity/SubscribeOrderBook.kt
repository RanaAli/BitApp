package com.rana.bitapp.domain.entity

class SubscribeOrderBook(
    override val event: String,
    override val channel: String,
    override val symbol: String,
    val frequency: String
) : BaseSubscribe(event, channel, symbol)