package com.rana.bitapp.domain.model.mappers

import com.rana.bitapp.data.entity.tickers.TickerEntity
import com.rana.bitapp.data.entity.tickers.TickerListEntity
import com.rana.bitapp.domain.model.TickerDTO
import com.rana.bitapp.domain.model.TickersListDTO


fun TickerEntity.toTickerDTO() = TickerDTO(
    channelId = this.channelId,
    bid = this.bid,
    bidSize = this.bidSize,
    ask = this.ask,
    askSize = this.askSize,
    dailyChange = this.dailyChange,
    dailyChangePerc = this.dailyChangePerc,
    lastPrice = this.lastPrice,
    volume = this.volume,
    high = this.high,
    low = this.low
)

fun TickerListEntity.toTickerListDTO(): TickersListDTO {
    val tickersList = TickersListDTO()

    for (tickerDto in this) {
        tickersList.add(tickerDto.toTickerDTO())
    }

    return tickersList
}
