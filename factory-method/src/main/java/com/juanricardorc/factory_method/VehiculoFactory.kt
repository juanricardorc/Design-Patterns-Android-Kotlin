package com.juanricardorc.factory_method

import com.juanricardorc.coredata.model.Automovil
import com.juanricardorc.coredata.model.Camion
import com.juanricardorc.coredata.model.Vehiculo
import com.juanricardorc.coredata.model.VehiculoType

class VehiculoFactory {
    companion object {
        fun getVehiculo(vehiculoType: VehiculoType): Vehiculo? {
            return when (vehiculoType) {
                VehiculoType.CAMION -> {
                    Camion()
                }
                VehiculoType.AUTOMOVIL -> {
                    Automovil()
                }
                else -> {
                    null
                }
            }
        }
    }
}