package com.sofka.zoosystem.zoosys.service;

import com.sofka.zoosystem.zoosys.model.Respuesta;
import com.sofka.zoosystem.zoosys.model.strategy.ContextStrategy;
import com.sofka.zoosystem.zoosys.model.strategy.manuales.ElefanteManual;
import com.sofka.zoosystem.zoosys.model.strategy.manuales.LeonManual;
import org.springframework.stereotype.Service;

@Service
public class ManualService {

    public Respuesta obtenerManual(String tipoManual){
        String codRespuesta = "200", msjRespuesta ="Transacción OK.", datos="";
        ContextStrategy contextStrategy = new ContextStrategy();
        switch (tipoManual){
            case "elefante":
                contextStrategy.setManualStrategy(new ElefanteManual());
                break;
            case "leon":
                contextStrategy.setManualStrategy(new LeonManual());
                break;
            default:
                codRespuesta = "404";
                msjRespuesta ="Manual no encontrado";
        }
        return new Respuesta(codRespuesta, msjRespuesta, contextStrategy.ejecutarEstrategia());
    }


}
