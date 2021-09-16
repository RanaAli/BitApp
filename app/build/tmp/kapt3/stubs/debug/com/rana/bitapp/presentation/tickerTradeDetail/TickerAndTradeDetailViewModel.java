package com.rana.bitapp.presentation.tickerTradeDetail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\u00a8\u0006 "}, d2 = {"Lcom/rana/bitapp/presentation/tickerTradeDetail/TickerAndTradeDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getTickerUseCase", "Lcom/rana/bitapp/domain/use_case/getDetails/GetTickerUseCase;", "getTradeUseCase", "Lcom/rana/bitapp/domain/use_case/getDetails/GetTradeUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/rana/bitapp/domain/use_case/getDetails/GetTickerUseCase;Lcom/rana/bitapp/domain/use_case/getDetails/GetTradeUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_idState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_tickerState", "Lcom/rana/bitapp/presentation/tickerTradeDetail/TickerDetailState;", "_tradeState", "Lcom/rana/bitapp/presentation/tickerTradeDetail/TradeDetailState;", "arrayOfTradeDetails", "", "Lcom/rana/bitapp/presentation/models/TradeDetails;", "idState", "Lkotlinx/coroutines/flow/StateFlow;", "getIdState", "()Lkotlinx/coroutines/flow/StateFlow;", "tickerState", "getTickerState", "tradeState", "getTradeState", "getTicker", "", "tickerId", "getTrade", "launch", "app_debug"})
public final class TickerAndTradeDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.rana.bitapp.domain.use_case.getDetails.GetTickerUseCase getTickerUseCase = null;
    private final com.rana.bitapp.domain.use_case.getDetails.GetTradeUseCase getTradeUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _idState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> idState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.rana.bitapp.presentation.tickerTradeDetail.TickerDetailState> _tickerState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.rana.bitapp.presentation.tickerTradeDetail.TickerDetailState> tickerState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.rana.bitapp.presentation.tickerTradeDetail.TradeDetailState> _tradeState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.rana.bitapp.presentation.tickerTradeDetail.TradeDetailState> tradeState = null;
    private java.util.List<com.rana.bitapp.presentation.models.TradeDetails> arrayOfTradeDetails;
    
    @javax.inject.Inject()
    public TickerAndTradeDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.domain.use_case.getDetails.GetTickerUseCase getTickerUseCase, @org.jetbrains.annotations.NotNull()
    com.rana.bitapp.domain.use_case.getDetails.GetTradeUseCase getTradeUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getIdState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.rana.bitapp.presentation.tickerTradeDetail.TickerDetailState> getTickerState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.rana.bitapp.presentation.tickerTradeDetail.TradeDetailState> getTradeState() {
        return null;
    }
    
    public final void launch() {
    }
    
    public final void getTicker(@org.jetbrains.annotations.NotNull()
    java.lang.String tickerId) {
    }
    
    public final void getTrade() {
    }
}