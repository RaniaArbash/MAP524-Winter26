package com.example.week7_v2_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week7_v2_jetpackcompose.ui.theme.Week7_V2_JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week7_V2_JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    studentProfile()
                }
            }
        }
    }
}

@Composable
fun studentProfile(){
    var myname = ""
    var name by remember { mutableStateOf("") } // string state var
    var age by remember { mutableStateOf("") }// string state var
    var showProfile by remember { mutableStateOf(false ) } // bool state var
   Column(
       modifier = Modifier.fillMaxSize().padding(20.dp),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally) {
       Text("Student Profile")
       Spacer(modifier = Modifier.height(20.dp))
       OutlinedTextField( value = name,
           onValueChange = {name = it },
           label = {Text("Enter Your Name")})
       Spacer(modifier = Modifier.height(20.dp))
       OutlinedTextField( value = age,
           onValueChange = {age = it },
           label = {Text("Enter Your Age")})
       Spacer(modifier = Modifier.height(20.dp))
       Button(onClick = {
           // make the profile card visible
           showProfile = !showProfile
       }) {
           Text("Show Profile")
       }
       Spacer(modifier = Modifier.height(20.dp))
       if (showProfile && name.isNotEmpty() && age.isNotEmpty()) {
           Card(modifier = Modifier.fillMaxWidth()) {
               Column(modifier = Modifier.padding(16.dp),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally) {
                   Text("Student Info")
                   Text("Name: ${name}")
                   Text("Age: ${age}")
               }
           }
       }
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week7_V2_JetpackComposeTheme {
        studentProfile()
    }
}