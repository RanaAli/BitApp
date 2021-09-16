package com.rana.bitapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/rana/bitapp/domain/repository/BitfinexRepository;", "", "observeTicker", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rana/bitapp/data/entity/tickers/TickerEntity;", "subscribeTicker", "Lcom/rana/bitapp/domain/entity/SubscribeTicker;", "observeTrade", "Lcom/rana/bitapp/domain/model/TradeDetailsDTO;", "subscribeTrade", "Lcom/rana/bitapp/domain/entity/SubscribeTrade;", "app_debug"})
public abstract interface BitfinexRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.rana.bitapp.data.entity.tickers.TickerEntity> observeTicker(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.domain.entity.SubscribeTicker subscribeTicker);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.rana.bitapp.domain.model.TradeDetailsDTO> observeTrade(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.domain.entity.SubscribeTrade subscribeTrade);
}