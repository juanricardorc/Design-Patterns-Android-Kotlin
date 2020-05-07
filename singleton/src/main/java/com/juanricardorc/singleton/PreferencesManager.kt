package com.juanricardorc.singleton

import android.content.Context
import android.content.SharedPreferences

/*
*
* Usando object.
*
* */

object PreferencesManager {

    private lateinit var sharedPreferences: SharedPreferences
    private var PRIVATE_MODE = 0
    private const val NAME_PREFERENCES_MANAGER = "design-pattern-welcome"

    private fun open(context: Context?) {
        this.sharedPreferences =
            context?.getSharedPreferences(NAME_PREFERENCES_MANAGER, PRIVATE_MODE)!!
    }

    fun set(context: Context?, key: String, value: String) {
        open(context = context)
        this.sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(context: Context?, key: String, defValue: String): String? {
        open(context = context)
        return this.sharedPreferences.getString(key, defValue)
    }

}