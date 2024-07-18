package org.example;

public class Estudiante {
    String cedula;
    String nombre;
    Double b1;
    Double b2;

    public Estudiante() {
    }

    public Estudiante(Double b2, Double b1, String nombre, String cedula) {
        this.b2 = b2;
        this.b1 = b1;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getB1() {
        return b1;
    }

    public void setB1(Double b1) {
        this.b1 = b1;
    }

    public Double getB2() {
        return b2;
    }

    public void setB2(Double b2) {
        this.b2 = b2;
    }
}

