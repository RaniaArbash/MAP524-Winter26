package com.example.weatherapp_winter26.UILayer.RoomDBUILayer

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp_winter26.DataLayer.RoomDataLayer.City
import com.example.weatherapp_winter26.DataLayer.RoomDataLayer.CityDatabase
import com.example.weatherapp_winter26.DataLayer.RoomDataLayer.CityRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class RoomDBViewModel(application: Application): AndroidViewModel(application) {

    private val repository: CityRepo

    init {
        val dao = CityDatabase.getDB(application).cityDao()
        repository = CityRepo(dao)
    }

    private var _favoritesCities = MutableStateFlow<List<City>?>(emptyList())
    val favoritesCities: MutableStateFlow<List<City>??> = _favoritesCities


    fun getAllSavedCities() {
        viewModelScope.launch {
            _favoritesCities.value =
                repository.getAllCities() as List<City>? //.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())
        }
    }

    fun deleteCity(city: City) {
        viewModelScope.launch {
            repository.deleteOneCity(city)
        }
    }

    fun searchForCIty(text: String) {
        viewModelScope.launch {
            _favoritesCities.value = repository.searchForCities(text)
        }
    }


    fun addNewCity(name: String, lat: Double, lon: Double) {
        viewModelScope.launch {
            repository.addNewCity(City(0, name, lat, lon))
        }
    }
}