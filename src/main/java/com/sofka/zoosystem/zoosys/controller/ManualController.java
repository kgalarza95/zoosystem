package com.sofka.zoosystem.zoosys.controller;

import com.sofka.zoosystem.zoosys.model.Respuesta;
import com.sofka.zoosystem.zoosys.service.ManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manuales")
public class ManualController {

    @Autowired
    ManualService manualService;

    @GetMapping("/{opcion}")
    public Respuesta obtenerManual(@PathVariable("opcion") String opcion) {
        return manualService.obtenerManual(opcion);
    }

}
