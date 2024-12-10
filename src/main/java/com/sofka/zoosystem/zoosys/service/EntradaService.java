package com.sofka.zoosystem.zoosys.service;

import com.sofka.zoosystem.zoosys.model.Respuesta;
import com.sofka.zoosystem.zoosys.model.strategy.EntradaStrategy;
import com.sofka.zoosystem.zoosys.model.strategy.entrada.EntradaAdultoStrategy;
import com.sofka.zoosystem.zoosys.model.strategy.entrada.EntradaNinoStrategy;
import com.sofka.zoosystem.zoosys.model.strategy.entrada.EntradaTerceraEdadStrategy;
import com.sofka.zoosystem.zoosys.model.visitantes.Visitante;

public class EntradaService {

    public Respuesta calcularEntrada(Visitante visitante) {
        String codRespuesta = "200", msjRespuesta ="Transacción OK.", datos="";

        EntradaStrategy strategy = null;

        switch (visitante.getTipo().toLowerCase()) {
            case "niño":
                strategy = new EntradaNinoStrategy();
                break;
            case "adulto":
                strategy = new EntradaAdultoStrategy();
                break;
            case "tercera edad":
                strategy = new EntradaTerceraEdadStrategy();
                break;
            default:
                codRespuesta = "404";
                msjRespuesta ="Manual no encontrado";
        }

        return new Respuesta(codRespuesta, msjRespuesta,strategy.calcularPrecio());
    }

}
