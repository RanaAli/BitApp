package com.rana.bitapp.domain.use_case.getDetails

import com.rana.bitapp.domain.entity.BaseSubscribe
import com.rana.bitapp.domain.entity.SubscribeTrade
import com.rana.bitapp.domain.repository.BitfinexRepository
import com.rana.bitapp.presentation.models.TradeDetails
import com.rana.bitapp.presentation.models.toTradeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetTradeUseCase @Inject constructor(
    private val bitfinexRepository: BitfinexRepository
) {

    operator fun invoke(): Flow<TradeDetails> = flow {

        SubscribeTrade(
            event = BaseSubscribe.SUBSCRIBE_EVENT,
            channel = BaseSubscribe.TRADE_CHANNEL,
            symbol = BaseSubscribe.BTCUSD_PAIR
        ).run {
            bitfinexRepository.observeTrade(this).let {
                it.collect { trade ->
                    emit(trade.toTradeData())
                }
            }
        }

    }.flowOn(Dispatchers.IO)

}