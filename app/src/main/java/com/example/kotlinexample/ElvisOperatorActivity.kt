package com.example.kotlinexample

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log

class ElvisOperatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) : Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_main)

        try {
            // code...
        } catch (e: Throwable) {
            Log.e("TAG", e.message ?: "Error message")
        }
    }
}
