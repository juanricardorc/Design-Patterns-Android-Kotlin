package com.juanricardorc.abstract_factory

import com.juanricardorc.coredata.model.Automovil
import com.juanricardorc.coredata.model.Camion

class CamnionFactory : VehiculoFactory() {
    override fun getAutomovil(id: String): Automovil? {
        return null
    }

    override fun getCamnion(id: String): Camion? {
        return Camion()
    }

}