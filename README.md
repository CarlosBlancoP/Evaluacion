Este proyecto es un sistema básico para registrar estudiantes en una escuela. Permite agregar estudiantes con su nombre y edad, así como mostrar la lista de estudiantes registrados.

 ## Tecnologías Utilizadas

Lenguaje de programación: Java

 ## Estructura del Proyecto

El proyecto contiene las siguientes clases:

 ## 1. Estudiante

Atributos: nombre (String), edad (int).

Métodos:

Constructor que usa this para inicializar los atributos.

Getters para obtener los valores de los atributos.

Método toString() para representar al estudiante en formato de texto.

 ## 2. Escuela

Atributos: Lista de estudiantes (List<Estudiante>).

Métodos:

Constructor que inicializa la lista de estudiantes.

Método agregarEstudiante(String nombre, int edad) para registrar un nuevo estudiante.

Método mostrarEstudiantes() para mostrar la lista de estudiantes registrados.

 ## 3. Main

Métodos:

Método main que instancia una escuela, agrega estudiantes y muestra la lista de registrados.
