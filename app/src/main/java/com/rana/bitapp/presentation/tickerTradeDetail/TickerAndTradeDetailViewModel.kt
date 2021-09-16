package com.rana.bitapp.presentation.tickerTradeDetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rana.bitapp.common.Constants
import com.rana.bitapp.domain.use_case.getDetails.GetTickerUseCase
import com.rana.bitapp.domain.use_case.getDetails.GetTradeUseCase
import com.rana.bitapp.presentation.models.TradeDetails
import com.rana.bitapp.presentation.models.toTicker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class TickerAndTradeDetailViewModel @Inject constructor(
    private val getTickerUseCase: GetTickerUseCase,
    private val getTradeUseCase: GetTradeUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _idState = MutableStateFlow(String())
    val idState: StateFlow<String> = _idState

    private val _tickerState = MutableStateFlow(TickerDetailState())
    val tickerState: StateFlow<TickerDetailState> = _tickerState

    private val _tradeState = MutableStateFlow(TradeDetailState())
    val tradeState: StateFlow<TradeDetailState> = _tradeState


    private var arrayOfTradeDetails: MutableList<TradeDetails> = arrayListOf()

    init {
        savedStateHandle.get<String>(Constants.PARAM_COIN_ID)?.let { selectedId ->
            _idState.value = selectedId
            getTicker(selectedId)
        }
        launch()
    }

    fun launch() {

        getTrade()
    }

    fun getTicker(tickerId: String) {

        getTickerUseCase(tickerId)
            .onEach { result ->
                _tickerState.value = TickerDetailState(ticker = result.toTicker())
            }.launchIn(viewModelScope)
    }

    fun getTrade() {

        getTradeUseCase()
            .onEach { result: TradeDetails ->

                if (arrayOfTradeDetails.size < 10)
                    arrayOfTradeDetails.add(result)
                else {
                    _tradeState.value =
                        TradeDetailState(trade = mutableListOf<TradeDetails>().apply {
                            addAll(arrayOfTradeDetails)
                        })
                    arrayOfTradeDetails.clear()
                }
            }
            .launchIn(viewModelScope)
    }
}