package com.sidra.dependencyinjection

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import javax.inject.Inject
import javax.inject.Singleton

interface One{
    fun getName()
}
class Name @Inject constructor():One
{
    override fun getName() {
        Log.d("main","My name is sidra")
    }

}

class Main @Inject constructor(private val one: One)
{
    fun getName(){
        one.getName()
    }
}

//@Module
//@InstallIn(ActivityComponent::class)
//abstract class Module {
//
//    @Binds
//    @Singleton
//    abstract fun binding(name: Name):One
//
//}