package com.rana.bitapp.data.remote.websockets

import android.util.Log
import com.rana.bitapp.data.entity.SubscribeTickerRequest
import com.rana.bitapp.data.entity.SubscribeTradeRequest
import com.rana.bitapp.data.entity.tickers.TickerEntity
import com.rana.bitapp.data.entity.toTickerEntity
import com.rana.bitapp.data.entity.toTradeEntity
import com.rana.bitapp.data.entity.trade.TradeEntity
import com.tinder.scarlet.WebSocket
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

private const val TICKER_SNAPSHOT_SIZE = 11
private const val TRADE_SNAPSHOT_MIN = 6
private const val TRADE_SNAPSHOT_MAX = 7

class BitfinexDataSourceImpl @Inject constructor(
    private val bitfinexApi: BitfinexWebSocketApi
) : BitfinexDataSource {

    override fun subscribeTicker(subscribeTickerRequest: SubscribeTickerRequest): Flow<TickerEntity> =
        flow {
            bitfinexApi
                .observeWebSocketEvent()
                .filter { it is WebSocket.Event.OnConnectionOpened<*> }
                .collect {

                    bitfinexApi
                        .apply {
                            sendTickerRequest(subscribeTickerRequest)
                            observeTicker()
                                .filter { it.size == TICKER_SNAPSHOT_SIZE }
                                .collect {
                                    emit(it.toTickerEntity())
                                }
                        }
                }
        }

    override fun subscribeTrade(subscribeTradeRequest: SubscribeTradeRequest): Flow<TradeEntity> =
        flow {
            bitfinexApi
                .observeWebSocketEvent()
                .filter { it is WebSocket.Event.OnConnectionOpened<*> }
                .collect {

                    bitfinexApi
                        .apply {
                            sendTradeRequest(subscribeTradeRequest)
                            observeTrade()
                                .filter {
                                    it.size in TRADE_SNAPSHOT_MIN..TRADE_SNAPSHOT_MAX
                                }
                                .collect {
                                    emit(it.toTradeEntity())
                                }
                        }
                }
        }

}
