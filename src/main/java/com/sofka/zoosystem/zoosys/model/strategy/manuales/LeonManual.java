package com.sofka.zoosystem.zoosys.model.strategy.manuales;

import com.sofka.zoosystem.zoosys.model.strategy.ManualStrategy;

public class LeonManual implements ManualStrategy {
    @Override
    public String obtenerManual() {
        return "Manual para registrar un león:"
                + "1. Asegurarse de que la jaula esté en buenas condiciones para transportarlo."
                + "2. Verificar que el león esté calmado antes de proceder con el registro."
                + "3. Registrar los datos básicos: nombre, edad, peso, y procedencia."
                + "4. Realizar un examen inicial desde una distancia segura utilizando herramientas apropiadas."
                + "5. Aplicar vacunas y tratamientos necesarios si se detectan problemas de salud.";
    }
}
