package com.juanricardorc.abstract_factory

class AutomovilFactory : VehiculoAbstractFactory() {
    override fun getAutomovil(id: String): Automovil {
        return Automovil()
    }

    override fun getCamnion(id: String): Camion? {
        return null
    }

}