package com.sofka.zoosystem.zoosys.model;

public class Respuesta {
    private String codigo;
    private String mensaje;
    private Object dato;

    public Respuesta() {

    }

    public Respuesta(String codigo, String mensaje, Object dato) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.dato = dato;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
