package com.example.weatherapp_winter26.DataLayer.CloudDBDataLayer

import com.google.firebase.firestore.FirebaseFirestore

object FirebaseInstance {
    val database: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()// should run once
    }
}