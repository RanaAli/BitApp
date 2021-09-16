package com.rana.bitapp.presentation.ticketList

import com.rana.bitapp.presentation.models.TickerList

data class TickerListState(
    val isLoading: Boolean = false,
    val tickerList: TickerList = TickerList(),
    val error: String = ""
)
