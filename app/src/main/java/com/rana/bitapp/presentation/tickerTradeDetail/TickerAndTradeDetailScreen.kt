package com.rana.bitapp.presentation.tickerTradeDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Preview
@Composable
private fun preview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            TickerRow()
            TradeRow()
        }
    }
}

@Composable
fun TickerAndTradeDetailScreen(
    viewModel: TickerAndTradeDetailViewModel = hiltViewModel()
) {
    val idState by viewModel.idState.collectAsState()
    val tickerState by viewModel.tickerState.collectAsState()
    val tradeState by viewModel.tradeState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {


            tickerState.ticker?.let { ticker ->
                TickerRow(idState, ticker)
            }

            Spacer(modifier = Modifier.height(16.dp))

            tradeState.trade?.let { trade ->
                TradeRow(idState, trade)
            }
        }

    }

}