package com.example.weatherapp_winter26.DataLayer.WeatherDataLayer

import retrofit2.http.GET
import retrofit2.http.Query


interface OpenWeatherMapAPI {
    // takes time // they should run async // not in main thread
    @GET("weather")
    suspend fun getWeather(@Query(value = "q") query: String ,
                           @Query("appid") apikey : String = "ecf5553cc5b15522aea8026824cb8085",
                           @Query("units") units :String = "metric"
                           ): WeatherResponse



    @GET("weather")
    suspend fun getWeatherByLocation(@Query(value = "lat") lat: Double ,
                                     @Query(value = "lon") lon: Double,
                           @Query("appid") apikey : String = "ecf5553cc5b15522aea8026824cb8085",
                           @Query("units") units :String = "metric"
    ): WeatherResponse

}