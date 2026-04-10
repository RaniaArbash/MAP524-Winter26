package com.example.weatherapp_winter26.DataLayer.CloudDBDataLayer

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

data class CloudFavCity
    (val docref: String,
     val name: String,
     val lon: Double,
     val lat: Double)


class CloudDBService() {

    private val firestore: FirebaseFirestore = FirebaseInstance.database

    // add New city
    // get all cities from cloud db
    // delete one city

    suspend fun addCityToFirebase(city: CloudFavCity): Boolean{
        val favCityToAdd = hashMapOf(
            "name" to city.name,
            "lat" to city.lat,
            "lon" to city.lon
        )
       return try {
            firestore.collection("favCities").add(favCityToAdd).await()
           true
        }catch (e: Exception){
            Log.d("cloud db", e.toString())
           false
        }
    }

    suspend fun readAllCitiesFromDB() : List<CloudFavCity>{
       try {
           val snapshot = firestore.collection("favCities").get().await()
           var dblist = emptyList<CloudFavCity>()
           for (doc in snapshot) {
               dblist += CloudFavCity(
                   docref = doc.id,
                   name = doc.data["name"] as String,
                   lon = doc.data["lon"] as Double,
                   lat = doc.data["lat"] as Double
               )
           }
           return  dblist
       } catch (e: Exception){
           return  emptyList()
       }
    }

    suspend fun deleteOneCityFromFirestore(docID: String): Boolean {
        return try {
            var docRef = firestore.collection("favCities").document(docID)
            docRef.delete().await()
            true
        }
        catch (e: Exception){
            false
        }
    }

}