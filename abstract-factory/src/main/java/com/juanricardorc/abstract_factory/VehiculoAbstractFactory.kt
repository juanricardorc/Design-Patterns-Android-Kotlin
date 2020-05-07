package com.juanricardorc.abstract_factory

abstract class VehiculoAbstractFactory {
    abstract fun getAutomovil(id: String): Automovil?
    abstract fun getCamnion(id: String): Camion?
}