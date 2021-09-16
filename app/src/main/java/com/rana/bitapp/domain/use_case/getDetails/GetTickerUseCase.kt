package com.rana.bitapp.domain.use_case.getDetails

import com.rana.bitapp.domain.entity.BaseSubscribe
import com.rana.bitapp.domain.entity.SubscribeTicker
import com.rana.bitapp.domain.model.TickerDTO
import com.rana.bitapp.domain.model.mappers.toTickerDTO
import com.rana.bitapp.domain.repository.BitfinexRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetTickerUseCase @Inject constructor(
    private val bitfinexRepository: BitfinexRepository
) {

    operator fun invoke(id: String): Flow<TickerDTO> = flow {

        bitfinexRepository.observeTicker(
            SubscribeTicker(
                event = BaseSubscribe.SUBSCRIBE_EVENT,
                channel = BaseSubscribe.TICKER_CHANNEL,
                symbol = id
            )
        ).collect { ticker ->
            emit(ticker.toTickerDTO())
        }

    }.flowOn(Dispatchers.IO)

}