package com.example.weatherapp_winter26.UILayer.LocationUILayer

import android.Manifest
import android.app.Application
import android.location.Location
import androidx.annotation.RequiresPermission
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp_winter26.DataLayer.LocationDataLayer.LocationService
import com.example.weatherapp_winter26.DataLayer.WeatherDataLayer.WeatherRepo
import com.example.weatherapp_winter26.DataLayer.WeatherDataLayer.WeatherResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LocationViewModel(application: Application): AndroidViewModel(application){

    var weatherRepo = WeatherRepo()
    private val _currentLocation = MutableStateFlow<Location?>(null)
    val currentLocation : StateFlow<Location?> = _currentLocation

    val _weatherState= MutableStateFlow<WeatherResponse?>(null)
    val weatherState : MutableStateFlow<WeatherResponse?> = _weatherState



    var locationService = LocationService(application)

    @RequiresPermission(allOf = [Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION])
    fun fetchLocation(){
        viewModelScope.launch {
            try {
                var location = locationService.getCurrentLocation()
                _currentLocation.value = location
            }catch (e: Exception){
                _currentLocation .value = null
                print(e.toString())
            }
        }

    }

    fun getWeatherInLocation(lat: Double, lon: Double){
        viewModelScope.launch {
           weatherState.value = weatherRepo.getWeatherByLocation(lat, lon)
        }
    }


}