package com.juanricardorc.designpatterns.behavioral

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BehavioralViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Patrones de comportamiento"
    }
    val text: LiveData<String> = _text
}