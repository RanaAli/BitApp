package com.rana.bitapp.data.remote.websockets

import com.rana.bitapp.data.entity.SubscribeTickerRequest
import com.rana.bitapp.data.entity.SubscribeTradeRequest
import com.rana.bitapp.data.entity.tickers.TickerEntity
import com.rana.bitapp.data.entity.trade.TradeEntity
import kotlinx.coroutines.flow.Flow

interface BitfinexDataSource {

    fun subscribeTicker(subscribeTickerRequest: SubscribeTickerRequest): Flow<TickerEntity>
    fun subscribeTrade(subscribeTradeRequest: SubscribeTradeRequest): Flow<TradeEntity>

}
