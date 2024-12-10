package com.sofka.zoosystem.zoosys.controller;


import com.sofka.zoosystem.zoosys.model.visitantes.Visitante;
import com.sofka.zoosystem.zoosys.service.EntradaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entrada")
public class EntradaController {

    private final EntradaService entradaService = new EntradaService();

    @PostMapping("/precio")
    public ResponseEntity<Double> obtenerPrecioEntrada(@RequestBody Visitante visitante) {
        return ResponseEntity.ok(Double.parseDouble(entradaService.calcularEntrada(visitante).getDato().toString()));
    }

}
