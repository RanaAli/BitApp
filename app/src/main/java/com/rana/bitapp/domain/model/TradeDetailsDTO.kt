package com.rana.bitapp.domain.model

import com.rana.bitapp.data.entity.trade.TradeEntity

data class TradeDetailsDTO(
    val channel_id: String = "",
    val tu_te: String = "",
    val seq: String = "",
    val id: String = "",
    val timestamp: String = "",
    val price: String = "",
    val amount: String = ""
)

fun TradeEntity.toTradeDTO() = TradeDetailsDTO(
    channel_id = channel_id,
    tu_te = tu_te,
    seq = seq,
    id = id,
    timestamp = timestamp,
    price = price,
    amount = amount
)
