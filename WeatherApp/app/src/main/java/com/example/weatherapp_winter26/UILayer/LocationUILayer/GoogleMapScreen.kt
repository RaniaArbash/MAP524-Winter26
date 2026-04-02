package com.example.weatherapp_winter26.UILayer.LocationUILayer


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import android.Manifest
import android.location.Location
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun GoogleMapScreen( lvm : LocationViewModel = viewModel()) {

    val _currentLocation = MutableStateFlow<Location?>(null)
    val currentLocation: StateFlow<Location?> = _currentLocation
    var markerPosition by remember { mutableStateOf<LatLng?>(null) }
    val weatherData = lvm.weatherState.collectAsState()

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = @androidx.annotation.RequiresPermission(allOf = [android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION]) { granted ->
            if (granted) {
                lvm.fetchLocation()
            } else {
                Log.d("Error", "No permission")
            }
        })

    LaunchedEffect(key1 = Unit) {
        permissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)

    }

    val cameraPostionState = rememberCameraPositionState {
        position = CameraPosition(LatLng(43.65, -79.35), 10f, 1f, 1f)
    }

    GoogleMap(
        Modifier.fillMaxSize(),
        cameraPostionState,
        onMapLongClick = { latlon ->
            markerPosition = latlon
            lvm.getWeatherInLocation(latlon.latitude,latlon.longitude)
        }
    ) {
        markerPosition.let {
            it?.let { position -> Marker(
                    state = MarkerState(position),
                    title = "Selected Location"
                )
            }
        }
    }

    if (weatherData.value != null){
    weatherData?.let { weather ->
        Card (){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(fontSize = 20.sp, text =  "Lat: ${markerPosition?.latitude} Lon: ${markerPosition?.longitude}" )
                Text(fontSize = 30.sp, text =   weather.value!!.main.temp.toString()+"C")
                Text(fontSize = 15.sp, text = "Feels Like: " + weather.value!!.main.feels_like.toString())
                Text(fontSize = 20.sp, text = weather.value!!.weather[0].description)
            }
        }

    }}


}