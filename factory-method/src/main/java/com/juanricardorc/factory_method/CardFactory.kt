package com.juanricardorc.factory_method

class CardFactory {

    companion object {
        fun getCard(cardType: CardType): Card {
            return when (cardType) {
                CardType.DEBIT -> {
                    CardDebit()
                }
                CardType.DEBIT -> {
                    CardCredit()
                }
                else -> {
                    CardCredit()
                }
            }
        }
    }

}