package com.example.weatherapp_winter26.DataLayer.CloudDBDataLayer

class CloudDBRepo() {

        val cloudService: CloudDBService = CloudDBService()

        suspend fun insertCityToFireStorecit (city :CloudFavCity): Boolean{
            return  cloudService.addCityToFirebase(city )
        }

        suspend fun readAllCitiesFromFirestore() : List<CloudFavCity> {
            return cloudService.readAllCitiesFromDB()
        }

        suspend fun deleteOneCityFromFirestore(docID: String): Boolean {
            return cloudService.deleteOneCityFromFirestore(docID)
        }

}