package com.example.weatherapp_winter26.DataLayer.SearchDataLayer

class SearchRepo {

    suspend fun searchForCities(query: String) : List<String> {
        if (query.length < 2) return emptyList()
        return CitiesAPIService.api.autoCompleteCity(query)
    }

}