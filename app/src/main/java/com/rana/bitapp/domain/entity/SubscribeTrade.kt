package com.rana.bitapp.domain.entity

class SubscribeTrade(
    override val event: String,
    override val channel: String,
    override val symbol: String
) : BaseSubscribe(event, channel, symbol)