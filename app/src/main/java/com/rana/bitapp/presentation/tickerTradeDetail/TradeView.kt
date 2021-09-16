package com.rana.bitapp.presentation.tickerTradeDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rana.bitapp.presentation.getPriceColor
import com.rana.bitapp.presentation.models.TradeDetails
import com.rana.bitapp.presentation.ui.theme.Typography
import java.util.*


@Preview
@Composable
fun TradeRow(
    id: String = "tBTCAED",
    tradeList: List<TradeDetails> = listOf(
        TradeDetails(
            channel_id = "",
            price = "100$",
            amount = "10000",
            timestamp = "112313"
        )
    )
) {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(16.dp)
    ) {

        TradeHeading(id)
        ShowTradeList(tradeList)

    }

}

@Composable
private fun TradeHeading(id: String) {
    Text(text = "Market Trade", style = Typography.subtitle2, color = Color.Black)

    Spacer(modifier = Modifier.height(20.dp))

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Amount" + "(${id.substring(1, 4)})",
            style = Typography.subtitle2,
            color = Color.Black,
            modifier = Modifier.weight(1f),
        )
        Text(
            text = "Price"+ "(${id.substring(4, 6)})",
            style = Typography.subtitle2,
            color = Color.Black,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "Time",
            style = Typography.subtitle2,
            color = Color.Black,
            modifier = Modifier.weight(1f)
        )
    }

    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
private fun ShowTradeList(tradeList: List<TradeDetails>) {
    LazyColumn() {

        items(tradeList) { trade ->

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = trade.amount,
                    style = Typography.body2,
                    color = Color.Black,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = trade.price,
                    style = Typography.body2,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = getPriceColor(dailyChangePerc = trade.amount),
                    modifier = Modifier.weight(1f)
                )

                val toLocalDateTime = getShortDate(trade.timestamp.toLong())

                Text(
                    text = toLocalDateTime,
                    style = Typography.body2,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)

                )
            }

        }
    }
}

fun getShortDate(ts: Long?): String {
    if (ts == null) return ""
    val calendar = Calendar.getInstance(Locale.getDefault())
    calendar.timeInMillis = ts
    return android.text.format.DateFormat.format("hh:mm:ss aa", calendar).toString()
}