package com.rana.bitapp.data.repository

import com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi
import com.rana.bitapp.data.entity.tickers.TickerListEntity
import com.rana.bitapp.data.entity.toTickerListEntity
import com.rana.bitapp.domain.repository.TicketRepository
import javax.inject.Inject

class TicketRepositoryImpl @Inject constructor(
    private val api: BitFinexRetrofitApi
) : TicketRepository {

    override suspend fun getTickers(): TickerListEntity {
        return api.getTickets().toTickerListEntity()
    }

}