package com.rana.bitapp.data.remote.websockets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/rana/bitapp/data/remote/websockets/BitfinexWebSocketApi;", "", "observeTicker", "Lkotlinx/coroutines/flow/Flow;", "", "", "observeTrade", "observeWebSocketEvent", "Lcom/tinder/scarlet/WebSocket$Event;", "receiveResponse", "Lcom/rana/bitapp/data/entity/JsonResponse;", "sendTickerRequest", "", "subscribeTickerRequest", "Lcom/rana/bitapp/data/entity/SubscribeTickerRequest;", "sendTradeRequest", "subscribeTradeRequest", "Lcom/rana/bitapp/data/entity/SubscribeTradeRequest;", "app_debug"})
public abstract interface BitfinexWebSocketApi {
    
    @org.jetbrains.annotations.NotNull()
    @com.tinder.scarlet.ws.Receive()
    public abstract kotlinx.coroutines.flow.Flow<com.tinder.scarlet.WebSocket.Event> observeWebSocketEvent();
    
    @com.tinder.scarlet.ws.Send()
    public abstract void sendTickerRequest(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.entity.SubscribeTickerRequest subscribeTickerRequest);
    
    @org.jetbrains.annotations.NotNull()
    @com.tinder.scarlet.ws.Receive()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String[]> observeTicker();
    
    @com.tinder.scarlet.ws.Send()
    public abstract void sendTradeRequest(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.entity.SubscribeTradeRequest subscribeTradeRequest);
    
    @org.jetbrains.annotations.NotNull()
    @com.tinder.scarlet.ws.Receive()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String[]> observeTrade();
    
    @org.jetbrains.annotations.NotNull()
    @com.tinder.scarlet.ws.Receive()
    public abstract kotlinx.coroutines.flow.Flow<com.rana.bitapp.data.entity.JsonResponse> receiveResponse();
}