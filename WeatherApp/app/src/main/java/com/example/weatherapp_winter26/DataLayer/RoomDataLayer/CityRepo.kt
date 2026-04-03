package com.example.weatherapp_winter26.DataLayer.RoomDataLayer

class CityRepo (val city_dao: CityDAO){

    suspend fun addNewCity(city: City){
        city_dao.addNewCity(city)
    }

    suspend fun getAllCities(): List<City>{
       return city_dao.getAllFavCities()
    }

    suspend fun searchForCities(q: String): List<City>{
        return city_dao.getAllCitiesStartWith(q)
    }

    suspend fun deleteOneCity(city: City){
        city_dao.deleteCity(city)
    }

}