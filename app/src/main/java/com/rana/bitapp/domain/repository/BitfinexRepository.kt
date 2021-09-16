package com.rana.bitapp.domain.repository

import com.rana.bitapp.data.entity.tickers.TickerEntity
import com.rana.bitapp.data.entity.tickers.TickerListEntity
import com.rana.bitapp.domain.entity.SubscribeTicker
import com.rana.bitapp.domain.entity.SubscribeTrade
import com.rana.bitapp.domain.model.TickerDTO
import com.rana.bitapp.domain.model.TradeDetailsDTO
import kotlinx.coroutines.flow.Flow


interface BitfinexRepository {

    fun observeTicker(subscribeTicker: SubscribeTicker): Flow<TickerEntity>
    fun observeTrade(subscribeTrade: SubscribeTrade): Flow<TradeDetailsDTO>

}