package com.sofka.zoosystem.zoosys.controller;

import com.sofka.zoosystem.zoosys.model.Respuesta;
import com.sofka.zoosystem.zoosys.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/animales")
public class AnimalController {

    @Autowired
    private AnimalService animalService;


    @PostMapping
    public Respuesta crearAnimal(){
        return animalService.crearAnimal();
    }
}
