package com.rana.bitapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/rana/bitapp/data/repository/TicketRepositoryImpl;", "Lcom/rana/bitapp/domain/repository/TicketRepository;", "api", "Lcom/rana/bitapp/data/remote/restfullApi/BitFinexRetrofitApi;", "(Lcom/rana/bitapp/data/remote/restfullApi/BitFinexRetrofitApi;)V", "getTickers", "Lcom/rana/bitapp/data/entity/tickers/TickerListEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TicketRepositoryImpl implements com.rana.bitapp.domain.repository.TicketRepository {
    private final com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi api = null;
    
    @javax.inject.Inject()
    public TicketRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTickers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rana.bitapp.data.entity.tickers.TickerListEntity> continuation) {
        return null;
    }
}