package com.rana.bitapp.presentation.ticketList

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.rana.bitapp.presentation.Screen
import com.rana.bitapp.presentation.models.Ticker
import com.rana.bitapp.presentation.models.TickerList
import com.rana.bitapp.presentation.ticketList.components.TickerListItem

@Composable
fun TickerListScreen(
    navController: NavController,
    viewModel: TickerListViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        ShowList(state, navController)

        if (state.error.isNotBlank()) {
            Text(
                text = state.error,
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(Alignment.Center)
            )
        }
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}


@Preview
@Composable
fun PreviewList() {
    ShowList(state = TickerListState(tickerList = TickerList().apply {
        for (i in 1..20)
            this.add(
                Ticker(
                    dailyChangePerc = "-0.5",
                    lastPrice = "lastPrice",
                    volume = "volume",
                    high = "high",
                    low = "low"
                )
            )
    }), navController = null)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ShowList(
    state: TickerListState,
    navController: NavController?
) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentPadding = PaddingValues(16.dp),
    ) {

        items(state.tickerList) { ticker: Ticker ->
            Box(modifier = Modifier.padding(2.dp)) {
                TickerListItem(
                    ticker = ticker
                ) {
                    navController?.navigate(Screen.CoinDetailScreen.route + "/${ticker.channelId}")
                }
            }
        }

    }
}