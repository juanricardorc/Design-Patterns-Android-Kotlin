package com.juanricardorc.abstract_factory

data class Camion(
    var _id: String = "",
    var motor: String = "",
    var _color: String = " ",
    var weight: Double = 75.45,
    var category: String = ""
) : Vehiculo() {
    override fun getId(): String? {
        return _id
    }

    override fun getColor(): String? {
        return _color
    }

    override fun getVehiculoType(): VehiculoType? {
        return VehiculoType.CAMION
    }

}