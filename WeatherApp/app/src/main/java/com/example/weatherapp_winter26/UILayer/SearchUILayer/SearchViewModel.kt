package com.example.weatherapp_winter26.UILayer.SearchUILayer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp_winter26.DataLayer.SearchDataLayer.SearchRepo
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class SearchViewModel : ViewModel(){
    private val repo = SearchRepo() // access to data layer

    var cityList = emptyList<String>()

    private val _cities = MutableStateFlow<List<String>>(cityList);
    var cities : MutableStateFlow<List<String>> = _cities


    // No way to do any job in backgorund in UI Layer
    fun onSearch(query: String){
        viewModelScope.launch {
            _cities.value =  repo.searchForCities(query) // this function will return the list of cities
            delay(300)
        }
    }

    fun noSearch(){
        cities.value = emptyList()
    }


}