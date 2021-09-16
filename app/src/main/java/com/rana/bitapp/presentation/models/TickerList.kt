package com.rana.bitapp.presentation.models

import com.rana.bitapp.domain.model.TickersListDTO

class TickerList : ArrayList<Ticker>() {
}

fun TickersListDTO?.toTickerList(): TickerList {
    val tickerList = TickerList()

    this?.let {

        it.forEach { tickerDTO ->
            tickerList.add(tickerDTO.toTicker())
        }

    }

    return tickerList
}