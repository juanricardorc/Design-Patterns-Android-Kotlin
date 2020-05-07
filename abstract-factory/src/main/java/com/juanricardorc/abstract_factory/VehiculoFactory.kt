package com.juanricardorc.abstract_factory

import com.juanricardorc.coredata.model.Automovil
import com.juanricardorc.coredata.model.Camion

abstract class VehiculoFactory {
    abstract fun getAutomovil(id: String): Automovil?
    abstract fun getCamnion(id: String): Camion?
}