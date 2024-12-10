package com.sofka.zoosystem.zoosys.model.strategy.manuales;

import com.sofka.zoosystem.zoosys.model.strategy.ManualStrategy;

public class ElefanteManual implements ManualStrategy {
    @Override
    public String obtenerManual() {
        return "Manual elefante";
    }
}
