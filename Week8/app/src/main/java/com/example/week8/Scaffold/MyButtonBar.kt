package com.example.week8.Scaffold

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.navOptions
import com.example.week8.Navigation.navItems


@Composable
fun MyButtonBar(onNavigate : (String)-> Unit) {
    var list = listOf(navItems.LogIn, navItems.counter , navItems.calculator)
    var selectedIndex = remember { mutableStateOf(0) };
    NavigationBar{
        list.forEachIndexed { index, item ->
            NavigationBarItem(onClick = {
                selectedIndex.value = index
                onNavigate(item.path)
            },
                selected = selectedIndex.value == index ,
                label = { Text(item.title) },
                icon = {
                    Icon(imageVector = item.icon, contentDescription = "menu item")
                }
                )
        }
    }
}