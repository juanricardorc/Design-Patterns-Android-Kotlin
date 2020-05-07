package com.juanricardorc.abstract_factory

import com.juanricardorc.coredata.model.Automovil
import com.juanricardorc.coredata.model.Camion

class AutomovilFactory : VehiculoFactory() {
    override fun getAutomovil(id: String): Automovil {
        return Automovil()
    }

    override fun getCamnion(id: String): Camion? {
        return null
    }

}