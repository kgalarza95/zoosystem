package com.sofka.zoosystem.zoosys.model.strategy;

public class ContextStrategy {

    private ManualStrategy manualStrategy;

    public ContextStrategy() {
    }

    public ContextStrategy(ManualStrategy manualStrategy) {
        this.manualStrategy = manualStrategy;
    }

    public void setManualStrategy(ManualStrategy manualStrategy) {
        this.manualStrategy = manualStrategy;
    }

    public String ejecutarEstrategia(){
        return manualStrategy!= null?manualStrategy.obtenerManual():" ";
    }
}
