package com.juanricardorc.factory_method

class CardCredit : Card {
    override fun showCard() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCard(): CardModel {
        return CardModel(
            "20002",
            "Tarjeta Crédito",
            "8821 6464 6621 9027",
            7537.99,
            CardType.CREDIT,
            isActive = false
        )
    }

    fun isActive(): Boolean {
        return getCard().isActive
    }

}