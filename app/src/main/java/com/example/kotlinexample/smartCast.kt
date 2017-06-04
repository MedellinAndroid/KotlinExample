package com.example.kotlinexample

import android.content.Context

fun main(args: Array<String>) {
    val context : Context? = null
    context?.let {
        val res = context.resources
        val appName = res.getString(R.string.app_name)
        val shortName = appName.substring(0, 2)
    }

}

