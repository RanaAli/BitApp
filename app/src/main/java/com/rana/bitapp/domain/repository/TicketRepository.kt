package com.rana.bitapp.domain.repository

import com.rana.bitapp.data.entity.tickers.TickerListEntity

interface TicketRepository {

    suspend fun getTickers(): TickerListEntity

}