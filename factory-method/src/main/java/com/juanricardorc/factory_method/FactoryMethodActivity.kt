package com.juanricardorc.factory_method

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FactoryMethodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_method)
    }

    override fun onResume() {
        super.onResume()
        val card = CardFactory.getCard(CardType.DEBIT)
        Toast.makeText(baseContext, "" + card.getCard().toString(), Toast.LENGTH_LONG).show()
    }
}
