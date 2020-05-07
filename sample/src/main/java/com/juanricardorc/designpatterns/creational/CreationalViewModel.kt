package com.juanricardorc.designpatterns.creational

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CreationalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Patrones creacionales"
    }
    val text: LiveData<String> = _text
}