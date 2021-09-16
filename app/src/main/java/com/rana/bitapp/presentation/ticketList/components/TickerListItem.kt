package com.rana.bitapp.presentation.ticketList.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rana.bitapp.presentation.getPercentageChange
import com.rana.bitapp.presentation.getPriceColor
import com.rana.bitapp.presentation.getTitle
import com.rana.bitapp.presentation.models.Ticker

@Preview
@Composable
private fun showTickerListItem() {
    TickerListItem(
        ticker = Ticker(
            channelId = "channelId",
            dailyChangePerc = "-0.5",
            lastPrice = "lastPrice",
            volume = "volume",
            high = "high",
            low = "low"
        ), onItemClick = {})
}

@Composable
fun TickerListItem(
    ticker: Ticker,
    onItemClick: ((Ticker) -> Unit)
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .clickable { onItemClick(ticker) },
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Text(
                text = getTitle(ticker.channelId),
                style = MaterialTheme.typography.h4,
                overflow = TextOverflow.Ellipsis,
                color = Color.DarkGray,
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                val color = getPriceColor(dailyChangePerc = ticker.dailyChangePerc)

                Text(
                    text = ticker.lastPrice,
                    style = MaterialTheme.typography.body2,
                    overflow = TextOverflow.Ellipsis,
                    color = color,
                    maxLines = 1,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = getPercentageChange(ticker.dailyChangePerc),
                    style = MaterialTheme.typography.body2,
                    overflow = TextOverflow.Ellipsis,
                    color = color,
                    maxLines = 1,
                    textAlign = TextAlign.End,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}
