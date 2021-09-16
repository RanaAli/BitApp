package com.rana.bitapp.data.entity

import com.rana.bitapp.data.entity.tickers.TickerEntity
import com.rana.bitapp.data.entity.tickers.TickerListEntity
import com.rana.bitapp.data.entity.trade.TradeEntity


fun Array<String>.toTickerEntity() = TickerEntity(
    channelId = this[0],
    bid = this[1],
    bidSize = this[2],
    ask = this[3],
    askSize = this[4],
    dailyChange = this[5],
    dailyChangePerc = this[6],
    lastPrice = this[7],
    volume = this[8],
    high = this[9],
    low = this[10]
)

fun Array<Array<String>>.toTickerListEntity(): TickerListEntity {
    val tickersList = TickerListEntity()

    for (array in this) {
        tickersList.add(array.toTickerEntity())
    }

    return tickersList
}

fun Array<String>.toTradeEntity() =
    if (this.size == 6) TradeEntity(
        channel_id = this[0],
        tu_te = this[1],
        seq = this[2],
        timestamp = this[3],
        price = this[4],
        amount = this[5]
    ) else
        TradeEntity(
            channel_id = this[0],
            tu_te = this[1],
            seq = this[2],
            id = this[3],
            timestamp = this[4],
            price = this[5],
            amount = this[6]
        )

