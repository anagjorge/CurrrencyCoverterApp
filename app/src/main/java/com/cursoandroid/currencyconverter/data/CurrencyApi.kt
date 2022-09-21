package com.cursoandroid.currencyconverter.data

import com.cursoandroid.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface CurrencyApi {

    @GET("latest?&apikey=YOUR API KEY HERE")
    suspend fun getRates(
        @Query("base") base: String,
        @Query("symbols") symbols: String
    ): Response<CurrencyResponse>
}


