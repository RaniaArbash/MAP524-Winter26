package com.example.week8.Navigation

import androidx.compose.runtime.Composable
//import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost

import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.week8.composables.LogInComposable
import com.example.week8.screens.CalculatorScreen2
import com.example.week8.screens.CounterComposable


@Composable
fun MyNavHost(navController : NavHostController){
   NavHost(navController = navController, startDestination = navItems.LogIn.path){
       composable(route = navItems.counter.path){ CounterComposable()}
       composable(route = navItems.LogIn.path){ LogInComposable()}
       composable(route = navItems.calculator.path){ CalculatorScreen2() }

   }


}