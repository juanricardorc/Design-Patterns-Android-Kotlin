package com.juanricardorc.abstract_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class AbstractFactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract_factory)
    }

    override fun onResume() {
        super.onResume()

        var automovil: Automovil = Automovil("A99270T", "MOY65-23D", "Rojo")
        Toast.makeText(baseContext, "" + automovil.toString(), Toast.LENGTH_LONG).show()

    }
}
