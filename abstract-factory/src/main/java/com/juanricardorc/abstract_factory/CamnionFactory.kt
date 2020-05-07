package com.juanricardorc.abstract_factory

class CamnionFactory : VehiculoAbstractFactory() {
    override fun getAutomovil(id: String): Automovil? {
        return null
    }

    override fun getCamnion(id: String): Camion? {
        return Camion()
    }

}