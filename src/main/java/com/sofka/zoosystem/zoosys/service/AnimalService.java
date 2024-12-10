package com.sofka.zoosystem.zoosys.service;

import com.sofka.zoosystem.zoosys.model.Respuesta;
import com.sofka.zoosystem.zoosys.model.animales.Elefante;
import com.sofka.zoosystem.zoosys.model.animales.Leon;
import com.sofka.zoosystem.zoosys.model.general.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    public Respuesta crearAnimal( ) {
        List<Animal> listAnimales = new ArrayList<>();
        System.out.println();
        Animal elefante = new Elefante("Elefantito", 2, 4, "Macho");
        Animal leon = new Leon("Leonillo", 1, 2, "Macho");

        listAnimales.add(elefante);
        listAnimales.add(leon);

        return new Respuesta("200", "Transacción ok", listAnimales);
    }
}
