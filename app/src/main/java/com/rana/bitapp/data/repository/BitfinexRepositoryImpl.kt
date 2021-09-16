package com.rana.bitapp.data.repository

import com.rana.bitapp.data.entity.tickers.TickerEntity
import com.rana.bitapp.data.remote.websockets.BitfinexDataSource
import com.rana.bitapp.data.entity.toSubscribeTickerRequest
import com.rana.bitapp.data.entity.toSubscribeTradeRequest
import com.rana.bitapp.domain.entity.SubscribeTicker
import com.rana.bitapp.domain.entity.SubscribeTrade
import com.rana.bitapp.domain.model.*
import com.rana.bitapp.domain.repository.BitfinexRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class BitfinexRepositoryImpl @Inject constructor(
    private val bitfinexDataSource: BitfinexDataSource
) : BitfinexRepository {

    override fun observeTicker(subscribeTicker: SubscribeTicker): Flow<TickerEntity> = flow {
        bitfinexDataSource.subscribeTicker(subscribeTicker.toSubscribeTickerRequest())
            .collect {
                emit(it)
            }
    }.flowOn(Dispatchers.IO)


    override fun observeTrade(subscribeTrade: SubscribeTrade): Flow<TradeDetailsDTO> = flow {
        bitfinexDataSource.subscribeTrade(subscribeTrade.toSubscribeTradeRequest())
            .map { response ->
                response.toTradeDTO()
            }.collect {
                emit(it)
            }
    }.flowOn(Dispatchers.IO)

}
