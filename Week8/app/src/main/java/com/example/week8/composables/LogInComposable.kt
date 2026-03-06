package com.example.week8.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.week8.R
import com.example.week8.screens.FirstViewModel


@Composable
fun LogInComposable(vm : FirstViewModel = viewModel()) {
    var isLoggedIn = remember { mutableStateOf(false) }
    var userInput = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(40.dp))
       Image(painter = painterResource(R.drawable.pic),
           contentDescription = "winter")

        TextField(
            placeholder = {"Enter Your name"},
            label = {"Enter Your Name"},
            value = userInput.value,
            onValueChange = {
                userInput.value = it
            }
            )
        Button(onClick = {
            vm.updateLoggedInUser(userInput.value)
            isLoggedIn.value = true
        }) {
            Text("Log In")
        }

        if (isLoggedIn.value) {
            Text("Welcome ${vm.name}")
        }

    }
    }