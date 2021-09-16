package com.rana.bitapp.presentation.tickerTradeDetail

import com.rana.bitapp.presentation.models.Ticker

data class TickerDetailState(
    val isLoading: Boolean = false,
    val ticker: Ticker? = null,
    val error: String = ""
)
