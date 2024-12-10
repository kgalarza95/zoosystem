package com.sofka.zoosystem.zoosys.model.visitantes;

public class Visitante {
    private String nombre;
    private int edad;
    private String tipo; // niño, adulto, tercera edad

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Visitante(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
}
