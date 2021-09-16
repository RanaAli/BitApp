package com.rana.bitapp.data.remote.websockets

import com.rana.bitapp.data.entity.JsonResponse
import com.rana.bitapp.data.entity.SubscribeTickerRequest
import com.rana.bitapp.data.entity.SubscribeTradeRequest
import com.tinder.scarlet.WebSocket
import com.tinder.scarlet.ws.Receive
import com.tinder.scarlet.ws.Send
import kotlinx.coroutines.flow.Flow

interface BitfinexWebSocketApi {

    @Receive
    fun observeWebSocketEvent(): Flow<WebSocket.Event>

    @Send
    fun sendTickerRequest(subscribeTickerRequest: SubscribeTickerRequest)

    @Receive
    fun observeTicker(): Flow<Array<String>>

    @Send
    fun sendTradeRequest(subscribeTradeRequest: SubscribeTradeRequest)

    @Receive
    fun observeTrade(): Flow<Array<String>>

    @Receive
    fun receiveResponse(): Flow<JsonResponse>

}