package com.example;


public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

        // Agregar estudiantes
        escuela.agregarEstudiante("Felipe Pérez", 15);
        escuela.agregarEstudiante("María Jaurez", 26);
        escuela.agregarEstudiante("Carlos Blano", 23);

        // Mostrar estudiantes registrados
        escuela.mostrarEstudiantes();
    }
}