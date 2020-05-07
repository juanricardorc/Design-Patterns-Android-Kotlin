package com.juanricardorc.abstract_factory

class FactoryGenerator {
    fun getFactory(type: Int): VehiculoAbstractFactory {
        if (type == 1)
            return AutomovilFactory()
        else
            return CamnionFactory()
    }
}