package com.example.week8.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class FirstViewModel : ViewModel(){
    var counter = mutableStateOf(0)// integer state variable
    private set

    var name by mutableStateOf("")
    // any update to one of those varialbes ==> Inforce UI to rebuild


    fun updateLoggedInUser( s : String){
        name = s;
    }

    fun increase(){
        counter.value+= 1
    }

    fun decrease(){
        counter.value-=1
    }

}