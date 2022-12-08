package com.sidra.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine:Engine){
    fun getCar(){
        engine.getEngine()
        Log.d("main","Car is running!")
    }
}