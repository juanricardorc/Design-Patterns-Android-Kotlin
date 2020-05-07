package com.juanricardorc.coredata.model

data class Automovil(
    var _id: String = "000000",
    var _motor: String = "ANX-100",
    var _color: String = "Blanco"
) : Vehiculo() {
    override fun getId(): String? {
        return _id
    }

    override fun getColor(): String? {
        return _color
    }

    override fun getVehiculoType(): VehiculoType? {
        return VehiculoType.AUTOMOVIL
    }

    fun getMotor(): String {
        return _motor
    }

}