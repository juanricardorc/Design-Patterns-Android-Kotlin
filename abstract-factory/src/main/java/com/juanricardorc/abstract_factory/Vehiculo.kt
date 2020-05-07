package com.juanricardorc.abstract_factory

abstract class Vehiculo() {
    abstract fun getId(): String?
    abstract fun getColor(): String?
    abstract fun getVehiculoType(): VehiculoType?
}