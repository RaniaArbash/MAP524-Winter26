package com.example.weatherapp_winter26.DataLayer.SearchDataLayer

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object CitiesAPIService {
    private val BASE_URL = "http://gd.geobytes.com/"
    val api : GeoBytesAPI by lazy {
        Retrofit.Builder().
        baseUrl(BASE_URL).
        addConverterFactory(GsonConverterFactory.create())
            .build().create(GeoBytesAPI::class.java)
    }
}