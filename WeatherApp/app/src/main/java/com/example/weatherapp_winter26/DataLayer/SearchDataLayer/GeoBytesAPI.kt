package com.example.weatherapp_winter26.DataLayer.SearchDataLayer

import retrofit2.http.GET
import retrofit2.http.Query

interface GeoBytesAPI {
    // takes time // they should run async // not in main thread
    @GET("AutoCompleteCity")
    suspend fun autoCompleteCity(@Query(value = "q") query: String):List<String>


    // post
    // delete

}