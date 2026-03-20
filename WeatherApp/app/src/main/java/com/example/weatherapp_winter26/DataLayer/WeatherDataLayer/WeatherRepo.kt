package com.example.weatherapp_winter26.DataLayer.WeatherDataLayer

class WeatherRepo {
    suspend fun getWeatherByName(cityName : String) : WeatherResponse {
        return WeatherAPI.api.getWeather(cityName)
    }

}