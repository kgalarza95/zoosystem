package com.sofka.zoosystem.zoosys.model.strategy.entrada;

import com.sofka.zoosystem.zoosys.model.strategy.EntradaStrategy;

public class EntradaTerceraEdadStrategy implements EntradaStrategy {
    @Override
    public double calcularPrecio() {
        return 7.0; // Precio con descuento para tercera edad
    }
}
