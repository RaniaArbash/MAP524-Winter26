package com.example.week8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.week8.ui.theme.Week8Theme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.week8.Navigation.MyNavHost
import com.example.week8.Scaffold.MyButtonBar
import com.example.week8.Scaffold.MyFAB
import com.example.week8.Scaffold.MyTopBar
import com.example.week8.composables.LogInComposable
import com.example.week8.screens.CounterComposable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var navController = rememberNavController()
            Week8Theme {
                Scaffold(
                    topBar = { MyTopBar() },
                    modifier = Modifier.fillMaxHeight(),
                    floatingActionButton = { MyFAB() },
                    bottomBar = {
                        MyButtonBar(
                            { path->
                        navController.navigate(path)
                    })}
                ) {
                      innerPadding ->
                    MyNavHost(navController)
                }
                }

            }
        }
    }

