package com.sofka.zoosystem.zoosys.controller;

import com.sofka.zoosystem.zoosys.model.Respuesta;
import com.sofka.zoosystem.zoosys.model.general.Animal;
import com.sofka.zoosystem.zoosys.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/animales")
public class AnimalController {

    @Autowired
    private AnimalService animalService;


    @PostMapping
    public Respuesta crearAnimal(@RequestBody Animal animal){
        return animalService.crearAnimal(  );
    }
}
