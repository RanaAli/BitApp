package com.rana.bitapp.domain.entity

abstract class BaseSubscribe(
    open val event: String,
    open val channel: String,
    open val symbol: String
) {
    companion object {
        const val SUBSCRIBE_EVENT = "subscribe"
        const val TICKER_CHANNEL = "ticker"
        const val TRADE_CHANNEL = "trades"
        const val BTCUSD_PAIR = "BTCUSD"
    }
}