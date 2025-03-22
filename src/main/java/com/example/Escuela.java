package com.example;
import java.util.ArrayList;
import java.util.List;

class Escuela {
    private List<Estudiante> estudiantes;

    // Constructor para inicializar la lista
    public Escuela() {
        this.estudiantes = new ArrayList<>();
    }

    // agregar un estudiante
    public void agregarEstudiante(String nombre, int edad) {
        Estudiante estudiante = new Estudiante(nombre, edad);
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante);
    }

    //  mostrar la lista de estudiantes
    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes registrados:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
}

