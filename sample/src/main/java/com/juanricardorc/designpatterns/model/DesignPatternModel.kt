package com.juanricardorc.designpatterns.model

import android.graphics.drawable.Drawable

data class DesignPatternModel(
    var id: String = "",
    var icon: Drawable,
    var name: String,
    var isSaved: Boolean = false
)