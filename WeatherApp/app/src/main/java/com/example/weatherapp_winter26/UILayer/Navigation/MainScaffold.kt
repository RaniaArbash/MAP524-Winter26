package com.example.weatherapp_winter26.UILayer.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp_winter26.UILayer.LocationUILayer.GoogleMapScreen
import com.example.weatherapp_winter26.UILayer.LocationUILayer.WeatherInLocationScreen
import com.example.weatherapp_winter26.UILayer.RoomDBUILayer.FavCityScreen
import com.example.weatherapp_winter26.UILayer.SearchUILayer.SearchScreen
import com.example.weatherapp_winter26.UILayer.WeatherUILayer.WeatherScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScaffold() {

    val navController = rememberNavController()
     val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Weather App") }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = currentRoute == ScreenRoutes.CitySearch,
                    onClick = { navController.navigate(ScreenRoutes.CitySearch) },
                    icon = { Icon(Icons.Filled.Search, contentDescription = "Search") },
                    label = { Text("City Search") }
                )
                NavigationBarItem(
                    selected = currentRoute == ScreenRoutes.weatherInLocation,
                    onClick = { navController.navigate(ScreenRoutes.weatherInLocation) },
                    icon = { Icon(Icons.Filled.Place, contentDescription = "Location") },
                    label = { Text("Location") }
                )
                NavigationBarItem(
                    selected = currentRoute == ScreenRoutes.Map,
                    onClick = { navController.navigate(ScreenRoutes.Map) },
                    icon = { Icon(Icons.Filled.AddCircle, contentDescription = "Map") },
                    label = { Text("Map") }
                )
                NavigationBarItem(
                    selected = currentRoute == ScreenRoutes.Fav,
                    onClick = { navController.navigate(ScreenRoutes.Fav) },
                    icon = { Icon(Icons.Filled.Favorite, contentDescription = "Fav") },
                    label = { Text("Favorite Cities") }
                )
            }
        }
    ) { innerPadding ->
       AppNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}


@Composable
fun AppNavHost(navController: NavHostController,
               modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.CitySearch,
        modifier = modifier
    ) {
        // Screen 1 – Popular Destinations
        composable(ScreenRoutes.CitySearch) {
            CitySearchStack()
        }
        composable(ScreenRoutes.weatherInLocation) {
            WeatherInLocationScreen()
        }
        composable(ScreenRoutes.Map) {
            GoogleMapScreen()
        }
        composable(ScreenRoutes.Fav) {
            FavCityScreen()
        }

    }
}


@Composable
fun CitySearchStack(){
    val stackNavController = rememberNavController()
    NavHost(navController = stackNavController, startDestination = "citylist"){
        composable("citylist") {
            SearchScreen(stackNavController)
        }
        composable(route="weather/{cityName}") {
                backStakeEntry ->
            val cityName = backStakeEntry.arguments?.getString("cityName") ?:""
            WeatherScreen(cityName)
        }
        composable(route="location") {
        }
    }
}