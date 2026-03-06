package com.example.week8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.week8.ui.theme.Week8Theme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.week8.composables.LogInComposable
import com.example.week8.screens.CounterComposable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week8Theme {
                Scaffold(modifier = Modifier.fillMaxHeight())
                { innerPadding ->
                    Column() {
                        LogInComposable()
                        CounterComposable()
                    }
                }
            }
        }
    }
}

