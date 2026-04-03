package com.example.weatherapp_winter26.UILayer.RoomDBUILayer

import android.app.Application
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weatherapp_winter26.DataLayer.RoomDataLayer.City

@Composable
fun FavCityScreen(cityVM: RoomDBViewModel = viewModel()){

    val dbCities by cityVM.favoritesCities.collectAsState()
    var query by remember { mutableStateOf("") }
    LaunchedEffect(key1 = Unit) {
        cityVM.getAllSavedCities()
    }
    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = {
                query = it
                cityVM.searchForCIty(query)

            },

            label = { Text("Search city") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
            CityTable(dbCities) {
                cityVM.deleteCity(it)

        }
    }
}


@Composable
fun CityTable(
    list: List<City>?,
    onOneCitySelected: (City) -> Unit,
){
    LazyColumn {
        items(count = list?.size ?: 0)
        {
                index ->
            Row (modifier = Modifier.fillMaxWidth().padding(5.dp).clickable {
                onOneCitySelected(list?.get(index)!!)

            }) {
                Text(list?.get(index)?.cityName ?: "",
                    fontSize = 18.sp

                )
            }

        }
    }



}