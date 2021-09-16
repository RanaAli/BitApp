package com.rana.bitapp.presentation

sealed class Screen(val route: String) {
    object CoinListScreen: Screen("list_screen")
    object CoinDetailScreen: Screen("detail_screen")
}
