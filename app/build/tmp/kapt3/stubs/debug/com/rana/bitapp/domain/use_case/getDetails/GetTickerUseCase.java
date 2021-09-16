package com.rana.bitapp.domain.use_case.getDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/rana/bitapp/domain/use_case/getDetails/GetTickerUseCase;", "", "bitfinexRepository", "Lcom/rana/bitapp/domain/repository/BitfinexRepository;", "(Lcom/rana/bitapp/domain/repository/BitfinexRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/rana/bitapp/domain/model/TickerDTO;", "id", "", "app_debug"})
public final class GetTickerUseCase {
    private final com.rana.bitapp.domain.repository.BitfinexRepository bitfinexRepository = null;
    
    @javax.inject.Inject()
    public GetTickerUseCase(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.domain.repository.BitfinexRepository bitfinexRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.rana.bitapp.domain.model.TickerDTO> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}