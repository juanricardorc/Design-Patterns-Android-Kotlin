package com.juanricardorc.factory_method

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.juanricardorc.coredata.model.VehiculoType

class FactoryMethodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_method)
    }

    override fun onResume() {
        super.onResume()

        //Example Card
        val card = CardFactory.getCard(CardType.DEBIT)
        Toast.makeText(baseContext, "" + card.getCard().toString(), Toast.LENGTH_LONG).show()

        //Example Vehiculo
        val vehiculo = VehiculoFactory.getVehiculo(VehiculoType.AUTOMOVIL)
        //Toast.makeText(baseContext, "" + vehiculo.toString(), Toast.LENGTH_LONG).show()
    }
}
