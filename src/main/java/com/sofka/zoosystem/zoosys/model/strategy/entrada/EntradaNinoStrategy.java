package com.sofka.zoosystem.zoosys.model.strategy.entrada;

import com.sofka.zoosystem.zoosys.model.strategy.EntradaStrategy;

public class EntradaNinoStrategy implements EntradaStrategy {
    @Override
    public double calcularPrecio() {
        return 5.0; // Precio fijo para niños
    }
}
