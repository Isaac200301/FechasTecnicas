# FechasTecnicas

**FechasTecnicas** es una aplicación de escritorio desarrollada en Java que permite gestionar y operar con fechas de manera eficiente. Utiliza una interfaz gráfica para facilitar la interacción del usuario y está estructurada siguiendo buenas prácticas de desarrollo.

## 🧰 Tecnologías utilizadas

- **Java**: Lenguaje de programación principal.
- **Swing**: Biblioteca para crear interfaces gráficas.
- **Maven**: Herramienta para gestionar y construir el proyecto.
- **Git & GitHub**: Control de versiones y hospedaje del repositorio.

## 📁 Estructura del proyecto

```
FechasTecnicas/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── fechastrabajo/
│                       ├── GUI.java
│                       ├── LecturaArchivo.java
│                       ├── OperacionesFechas.java
│                       ├── GestionPersona.java
│                       └── Persona.java
├── target/
├── pom.xml
└── README.md
```

## 🧩 Descripción de clases principales

- **`GUI.java`**  
  Contiene la interfaz gráfica (Swing). Permite al usuario acceder a todas las funcionalidades del sistema.

- **`LecturaArchivo.java`**  
  Se encarga de leer datos desde archivos, especialmente los relacionados con fechas.

- **`OperacionesFechas.java`**  
  Contiene métodos para realizar operaciones como calcular diferencias entre fechas, validar fechas, etc.

- **`GestionPersona.java`**  
  Maneja la lógica de gestión de personas en el sistema.

- **`Persona.java`**  
  Clase que modela una persona con atributos como nombre, ID y fechas relacionadas.
