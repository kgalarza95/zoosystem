package com.sofka.zoosystem.zoosys.model.strategy.entrada;

import com.sofka.zoosystem.zoosys.model.strategy.EntradaStrategy;

public class EntradaAdultoStrategy implements EntradaStrategy {
    @Override
    public double calcularPrecio() {
        return 10.0; // Precio fijo para adultos
    }
}
