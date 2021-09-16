package com.rana.bitapp.presentation.ticketList

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rana.bitapp.common.Resource
import com.rana.bitapp.domain.use_case.getTickers.GetTickersUseCase
import com.rana.bitapp.presentation.models.toTickerList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class TickerListViewModel @Inject constructor(
    private val getTickersUseCase: GetTickersUseCase
) : ViewModel() {

    private val _state = mutableStateOf(TickerListState())
    val state: State<TickerListState> = _state

    init {
        getCoins()
    }

    private fun getCoins() {
        getTickersUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = TickerListState(tickerList = result.data.toTickerList())
                }
                is Resource.Error -> {
                    _state.value = TickerListState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = TickerListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}