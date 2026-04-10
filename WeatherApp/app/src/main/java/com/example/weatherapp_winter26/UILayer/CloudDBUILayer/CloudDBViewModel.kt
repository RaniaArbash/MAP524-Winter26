package com.example.weatherapp_winter26.UILayer.CloudDBUILayer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp_winter26.DataLayer.CloudDBDataLayer.CloudDBRepo
import com.example.weatherapp_winter26.DataLayer.CloudDBDataLayer.CloudFavCity
import kotlinx.coroutines.launch

class CloudDBViewModel: ViewModel() {
    var clouddbList by mutableStateOf<List<CloudFavCity>>(emptyList())

    private var cloudRepo = CloudDBRepo()

    fun getAllCitiesFromFirebase(){
        viewModelScope.launch {
            clouddbList =  cloudRepo.readAllCitiesFromFirestore()
        }
    }

    fun saveCityToCloudDB(name: String, lon: Double, lat: Double){
        viewModelScope.launch {
            cloudRepo.insertCityToFireStorecit(CloudFavCity("",name,lon,lat))
        }
    }

    fun deleteOneCityFromCLoudDB(docID: String){
        viewModelScope.launch {
            cloudRepo.deleteOneCityFromFirestore(docID)
            clouddbList = cloudRepo.readAllCitiesFromFirestore()

        }
    }



}