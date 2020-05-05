package com.juanricardorc.factory_method

class CardDebit : Card {
    override fun showCard() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCard(): CardModel {
        return CardModel(
            "10001",
            "Tarjeta Débito",
            "7464 6464 9218 6362",
            7464564.43,
            CardType.DEBIT,
            isActive = true
        )
    }

    fun isActive(): Boolean {
        return getCard().isActive
    }
}