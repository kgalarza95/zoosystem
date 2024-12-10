package com.sofka.zoosystem.zoosys.model.strategy.manuales;

import com.sofka.zoosystem.zoosys.model.strategy.ManualStrategy;

public class ElefanteManual implements ManualStrategy {
    @Override
    public String obtenerManual() {
        return "Manual para registrar un elefante:"
                + "1. Verificar la disponibilidad del área de manejo de animales grandes."
                + "2. Preparar un equipo especializado para tranquilizar al elefante si es necesario."
                + "3. Asegurarse de que el elefante esté adecuadamente hidratado antes del ingreso."
                + "4. Registrar los datos básicos: nombre, edad, peso, y estado general."
                + "5. Realizar un chequeo médico inicial, incluyendo medición de signos vitales.";
    }
}
