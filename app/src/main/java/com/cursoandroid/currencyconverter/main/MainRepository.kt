package com.cursoandroid.currencyconverter.main

import com.cursoandroid.currencyconverter.data.models.CurrencyResponse
import com.cursoandroid.currencyconverter.main.util.Resource

interface MainRepository {

    suspend fun getRates(base: String, symbols: String ): Resource<CurrencyResponse>

}