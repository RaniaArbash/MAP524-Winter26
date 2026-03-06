package com.example.week8.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun CounterComposable(counterViewModel : FirstViewModel = viewModel()){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("The Value is ${counterViewModel.counter.value}")
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Button(onClick = {
                counterViewModel.decrease()
            }) {
                Text("-")
            }
            Spacer(modifier = Modifier.width(40.dp))
            Button(onClick = {
                counterViewModel.increase()
            }) {
                Text("+")
            }
        }

        if (counterViewModel.name.isNotEmpty()){
            Text("Welcome ${counterViewModel.name}")
        }
    }
}