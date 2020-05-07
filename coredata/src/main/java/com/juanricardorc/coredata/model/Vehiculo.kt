package com.juanricardorc.coredata.model

abstract class Vehiculo() {
    abstract fun getId(): String?
    abstract fun getColor(): String?
    abstract fun getVehiculoType(): VehiculoType?
}