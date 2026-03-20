package com.example.weatherapp_winter26

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp_winter26.UILayer.Navigation.MainScaffold
import com.example.weatherapp_winter26.UILayer.SearchUILayer.SearchScreen
import com.example.weatherapp_winter26.UILayer.WeatherUILayer.WeatherScreen
import com.example.weatherapp_winter26.ui.theme.WeatherAppWinter26Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppWinter26Theme {
                MainScaffold()
            }
        }
    }
}