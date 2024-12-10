package com.sofka.zoosystem.zoosys.model.strategy;

public class ContextEntrada {
    private EntradaStrategy entradaStrategy;

    public ContextEntrada(EntradaStrategy entradaStrategy) {
        this.entradaStrategy = entradaStrategy;
    }

    public double ejecutarEstrategia() {
        return entradaStrategy.calcularPrecio();
    }

}
