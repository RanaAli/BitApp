package com.rana.bitapp.presentation.tickerTradeDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rana.bitapp.presentation.getPercentageChange
import com.rana.bitapp.presentation.getPriceColor
import com.rana.bitapp.presentation.models.Ticker
import com.rana.bitapp.presentation.ui.theme.Typography

@Preview
@Composable
fun TickerRow(
    id: String = "tBTCAED",
    ticker: Ticker = Ticker(
        channelId = "tBTCAED",
        dailyChangePerc = "temp",
        lastPrice = "lastPrice",
        volume = "volume",
        high = "high",
        low = "low"
    )
) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = getTitle(id),
            color = Color.Black,
            style = Typography.h3,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        TickerBox(ticker)
    }
}

@Composable
private fun TickerBox(ticker: Ticker) {
    Column(modifier = Modifier.background(Color.LightGray)) {

        Column(modifier = Modifier.padding(16.dp))
        {


            Row {
                Text(
                    text = "Open Price (00:00 UTC)",
                    style = Typography.subtitle2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "Daily Change (00:00 UTC)",
                    style = Typography.subtitle2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }

            Row {
                Text(
                    text = ticker.lastPrice,
                    style = Typography.body2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = ticker.dailyChange + "(${getPercentageChange(dailyChangePerc = ticker.dailyChangePerc)})",
                    style = Typography.body2,
                    color = getPriceColor(dailyChangePerc = ticker.dailyChangePerc),
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "Top Bid",
                    style = Typography.subtitle2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "Top Ask",
                    style = Typography.subtitle2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }

            Row {
                Text(
                    text = ticker.high,
                    style = Typography.body2,
                    color = if (ticker.bid.toDouble() > ticker.lastPrice.toDouble()) Color.Green else Color.Red,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = ticker.ask,
                    style = Typography.body2,
                    color = if (ticker.ask.toDouble() > ticker.lastPrice.toDouble()) Color.Green else Color.Red,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(
                    text = "Last Price",
                    style = Typography.subtitle2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "24hr range",
                    style = Typography.subtitle2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }

            Row {
                Text(
                    text = ticker.lastPrice,
                    style = Typography.body2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = ticker.low + " - " + ticker.high,
                    style = Typography.body2,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun getTitle(channelId: String): String {
    return channelId.substring(1, 4) + "/" + channelId.substring(4, 7)
}