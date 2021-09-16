package com.rana.bitapp.data.remote.websockets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/rana/bitapp/data/remote/websockets/BitfinexDataSourceImpl;", "Lcom/rana/bitapp/data/remote/websockets/BitfinexDataSource;", "bitfinexApi", "Lcom/rana/bitapp/data/remote/websockets/BitfinexWebSocketApi;", "(Lcom/rana/bitapp/data/remote/websockets/BitfinexWebSocketApi;)V", "subscribeTicker", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rana/bitapp/data/entity/tickers/TickerEntity;", "subscribeTickerRequest", "Lcom/rana/bitapp/data/entity/SubscribeTickerRequest;", "subscribeTrade", "Lcom/rana/bitapp/data/entity/trade/TradeEntity;", "subscribeTradeRequest", "Lcom/rana/bitapp/data/entity/SubscribeTradeRequest;", "app_debug"})
public final class BitfinexDataSourceImpl implements com.rana.bitapp.data.remote.websockets.BitfinexDataSource {
    private final com.rana.bitapp.data.remote.websockets.BitfinexWebSocketApi bitfinexApi = null;
    
    @javax.inject.Inject()
    public BitfinexDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.remote.websockets.BitfinexWebSocketApi bitfinexApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.rana.bitapp.data.entity.tickers.TickerEntity> subscribeTicker(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.entity.SubscribeTickerRequest subscribeTickerRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.rana.bitapp.data.entity.trade.TradeEntity> subscribeTrade(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.entity.SubscribeTradeRequest subscribeTradeRequest) {
        return null;
    }
}