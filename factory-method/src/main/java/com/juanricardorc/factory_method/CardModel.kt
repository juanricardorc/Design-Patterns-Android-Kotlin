package com.juanricardorc.factory_method

data class CardModel(
    var id: String,
    var name: String,
    var number: String,
    var amount: Double,
    var type: CardType,
    var isActive: Boolean = true
)

enum class CardType {
    CREDIT, DEBIT, FOOD
}