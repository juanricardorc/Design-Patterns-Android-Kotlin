package com.juanricardorc.abstract_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.juanricardorc.coredata.model.Automovil

class AbstractFactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract_factory)
    }

    override fun onResume() {
        super.onResume()

        //var automovil = Automovil("A99270T", "MOY65-23D", "Rojo")

        val vehiculoFactory = VehiculoAbstractFactory.getVehiculoFactory(1)
        val automovil = vehiculoFactory.getAutomovil("")
        Toast.makeText(baseContext, "" + automovil.toString(), Toast.LENGTH_LONG).show()

    }
}
