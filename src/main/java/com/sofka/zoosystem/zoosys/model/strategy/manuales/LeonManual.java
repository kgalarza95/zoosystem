package com.sofka.zoosystem.zoosys.model.strategy.manuales;

import com.sofka.zoosystem.zoosys.model.strategy.ManualStrategy;

public class LeonManual implements ManualStrategy {
    @Override
    public String obtenerManual() {
        return "Manual para registrar un le";
    }
}
