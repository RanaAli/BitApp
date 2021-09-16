package com.rana.bitapp.data.remote.restfullApi

import retrofit2.http.GET

interface BitFinexRetrofitApi {

    @GET("v2/tickers?symbols=ALL")
    suspend fun getTickets(): Array<Array<String>>

}