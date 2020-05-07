package com.juanricardorc.singleton

object PreferencesManager {
    private lateinit var value: String
    fun set(key: String, value: String) {
        this.value = value
    }

    fun get(): Any {
        return this.value
    }
}