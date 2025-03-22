package com.example;
// importar la clase ArrayList y List
import java.util.ArrayList;
import java.util.List;


class Estudiante {
    private String nombre;
    private int edad;

 
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}