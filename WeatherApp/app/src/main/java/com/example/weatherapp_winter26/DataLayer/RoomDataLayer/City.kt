package com.example.weatherapp_winter26.DataLayer.RoomDataLayer

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "favcities")
data class City (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val cityName: String,
    val lat: Double,
    val lon: Double) {
}