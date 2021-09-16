package com.rana.bitapp.presentation.tickerTradeDetail

import com.rana.bitapp.presentation.models.TradeDetails

data class TradeDetailState(
    val isLoading: Boolean = false,
    val trade: List<TradeDetails>? = null,
    val error: String = ""
)
