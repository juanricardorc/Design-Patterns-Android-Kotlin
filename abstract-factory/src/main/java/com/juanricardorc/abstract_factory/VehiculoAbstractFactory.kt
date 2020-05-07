package com.juanricardorc.abstract_factory

class VehiculoAbstractFactory {
    companion object {
        fun getVehiculoFactory(type: Int): VehiculoFactory {
            return if (type == 1)
                AutomovilFactory()
            else
                CamnionFactory()
        }
    }
}