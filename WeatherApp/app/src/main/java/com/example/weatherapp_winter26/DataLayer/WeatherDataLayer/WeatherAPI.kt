package com.example.weatherapp_winter26.DataLayer.WeatherDataLayer

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherAPI {
    private val BASE_URL = "https://api.openweathermap.org/data/2.5/"
    val api : OpenWeatherMapAPI by lazy {
        Retrofit.Builder().
        baseUrl(BASE_URL).
        addConverterFactory(GsonConverterFactory.create())
            .build().create(OpenWeatherMapAPI::class.java)
    }
}