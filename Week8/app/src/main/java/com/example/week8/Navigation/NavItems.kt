package com.example.week8.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Face

sealed class navItems {
    object LogIn : Item("logIn","Log In", Icons.Default.AccountCircle)
    object counter : Item("counter","Counter", Icons.Default.Face)
    object calculator : Item("calculator","Calculator", Icons.Default.AddCircle)
}