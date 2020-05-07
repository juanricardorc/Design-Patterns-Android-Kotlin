package com.juanricardorc.singleton

import android.content.Context
import android.content.SharedPreferences

/*
*
* Usando companion object.
*
* */

class PreferencesManagerV2(context: Context?) {
    private var sharedPreferences: SharedPreferences

    companion object {
        private var preferencesManagerV2: PreferencesManagerV2? = null
        @Synchronized
        fun getInstance(context: Context?): PreferencesManagerV2? {
            if (preferencesManagerV2 == null) {
                preferencesManagerV2 = PreferencesManagerV2(context)
            }
            return preferencesManagerV2
        }

        private const val NAME_PREFERENCES_MANAGER = "design-pattern-welcome-v2"
        private const val MODE = Context.MODE_PRIVATE
    }

    init {
        this.sharedPreferences =
            context!!.getSharedPreferences(NAME_PREFERENCES_MANAGER, MODE)
    }

    /***
     *
     * commit () - API Nivel 1+ , apply () - Nivel API 9+
     *
     * commit (), que escribe sus preferencias en el almacenamiento persistente de forma síncrona.
     *
     * apply () confirma sus cambios en la memoria SharedPreferences de inmediato, pero inicia
     * una confirmación asíncrona en el disco y no se le notificará ninguna falla.
     *
     */
    fun set(key: String, value: String) {
        this.sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String, defValue: String): String? {
        return this.sharedPreferences.getString(key, defValue)
    }
}