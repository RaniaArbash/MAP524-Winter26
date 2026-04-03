package com.example.weatherapp_winter26.DataLayer.RoomDataLayer

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface CityDAO {

    @Query("SELECT * FROM favcities")
    suspend fun getAllFavCities() : List<City>

    @Query("select * from favcities where cityName LIKE :query || '%'")
    suspend fun getAllCitiesStartWith(query: String): List<City>

    @Delete
    suspend fun deleteCity(cityToDelete: City)

    @Query("delete from favcities where cityName LIKE :startWith")
    suspend fun deleteOneCity(startWith: String)

    @Insert
    suspend fun addNewCity(newCity: City)


}