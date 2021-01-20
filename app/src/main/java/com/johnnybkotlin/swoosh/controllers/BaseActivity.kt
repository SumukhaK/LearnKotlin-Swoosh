package com.johnnybkotlin.swoosh.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName} is in onCreate")
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName} is in onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} is in onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} is in onResume()")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} is in onRestart()")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} is in onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} is in onDestroy()")
        super.onDestroy()
    }
}