package com.example.weatherapp_winter26.UILayer.WeatherUILayer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.viewModelScope
import com.example.weatherapp_winter26.DataLayer.WeatherDataLayer.WeatherRepo
import com.example.weatherapp_winter26.DataLayer.WeatherDataLayer.WeatherResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    val weatherRepo = WeatherRepo()// access to data layer

    val _weatherState= MutableStateFlow<WeatherResponse?>(null)
    val weatherState : MutableStateFlow<WeatherResponse?> = _weatherState

    fun loadWeather(cityName: String){
        viewModelScope.launch {
            _weatherState.value = weatherRepo.getWeatherByName(cityName)
        }
    }



}