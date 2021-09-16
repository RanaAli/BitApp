package com.rana.bitapp.presentation.models

import com.rana.bitapp.domain.model.TradeDetailsDTO

data class TradeDetails(
    val channel_id: String = "",
    val tu_te: String = "",
    val seq: String = "",
    val id: String = "",
    val timestamp: String = "",
    val price: String = "",
    val amount: String = ""
)

fun TradeDetailsDTO.toTradeData() = TradeDetails(
    channel_id = channel_id,
    tu_te = tu_te,
    seq = seq,
    id = id,
    timestamp = timestamp,
    price = price,
    amount = amount
)
