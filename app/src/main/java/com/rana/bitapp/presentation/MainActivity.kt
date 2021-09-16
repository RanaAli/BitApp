package com.rana.bitapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rana.bitapp.common.Constants
import com.rana.bitapp.presentation.tickerTradeDetail.TickerAndTradeDetailScreen
import com.rana.bitapp.presentation.ticketList.TickerListScreen
import com.rana.bitapp.presentation.ui.theme.BitAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            BitAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    SetupNavGraph(navController)
                }
            }

        }
    }

    @Composable
    private fun SetupNavGraph(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = Screen.CoinListScreen.route
        ) {
            composable(
                route = Screen.CoinListScreen.route
            ) {
                TickerListScreen(navController)
            }
            composable(
                route = Screen.CoinDetailScreen.route + "/{${Constants.PARAM_COIN_ID}}"
            ) {
                TickerAndTradeDetailScreen()
            }
        }
    }
}