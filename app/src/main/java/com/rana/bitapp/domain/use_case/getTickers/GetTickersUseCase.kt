package com.rana.bitapp.domain.use_case.getTickers

import com.rana.bitapp.common.Resource
import com.rana.bitapp.domain.model.TickersListDTO
import com.rana.bitapp.domain.model.mappers.toTickerListDTO
import com.rana.bitapp.domain.repository.TicketRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetTickersUseCase @Inject constructor(private val repository: TicketRepository) {

    operator fun invoke(): Flow<Resource<TickersListDTO>> = flow {
        try {
            emit(Resource.Loading<TickersListDTO>())
            val tickersList = repository.getTickers().toTickerListDTO()
            emit(Resource.Success<TickersListDTO>(tickersList))
        } catch (e: HttpException) {
            emit(
                Resource.Error<TickersListDTO>(
                    e.localizedMessage ?: "An unexpected error occurred"
                )
            )
        } catch (e: IOException) {
            emit(Resource.Error<TickersListDTO>("Couldn't reach server. Check your internet connection."))
        }
    }

}