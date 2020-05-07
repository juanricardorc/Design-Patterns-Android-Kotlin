package com.juanricardorc.designpatterns.structural

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StructuralViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Patrones estructurales"
    }
    val text: LiveData<String> = _text
}