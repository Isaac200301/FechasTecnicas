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

  ### 1. `GUI.java`

**Descripción:**  
Clase principal que contiene la interfaz gráfica de la aplicación. Permite al usuario interactuar con las diferentes funcionalidades relacionadas con la gestión de fechas.

**Componentes principales:**

- **Campos:**
  - `JFrame frame`: Ventana principal de la aplicación.
  - `JPanel panel`: Panel que contiene los componentes de la interfaz.
  - `JButton btnAgregar`: Botón para agregar nuevas fechas.
  - `JButton btnEliminar`: Botón para eliminar fechas seleccionadas.
  - `JTable tablaFechas`: Tabla que muestra las fechas registradas.

- **Métodos:**
  - `inicializarComponentes()`: Configura y organiza los componentes de la interfaz.
  - `agregarEventos()`: Asocia los eventos a los botones y otros componentes interactivos.
  - `mostrarFechas()`: Actualiza la tabla con las fechas almacenadas.

**Notas:**
- Utiliza el patrón MVC para separar la lógica de la interfaz.
- Implementa validaciones para asegurar la integridad de los datos ingresados por el usuario.

---

### 2. `LecturaArchivo.java`

**Descripción:**  
Encargada de la lectura y procesamiento de archivos que contienen datos relacionados con fechas. Facilita la importación de datos al sistema.

**Componentes principales:**

- **Métodos:**
  - `leerArchivo(String ruta)`: Lee el archivo ubicado en la ruta especificada y retorna una lista de objetos `Fecha`.
  - `parsearLinea(String linea)`: Convierte una línea del archivo en un objeto `Fecha`.

**Notas:**
- Maneja excepciones para archivos no encontrados o con formato incorrecto.
- Soporta archivos en formato CSV con delimitadores estándar.

---

### 3. `OperacionesFechas.java`

**Descripción:**  
Contiene métodos y funciones para realizar operaciones con fechas, como cálculos de diferencias, validaciones y conversiones.

**Componentes principales:**

- **Métodos:**
  - `calcularDiferenciaDias(LocalDate fecha1, LocalDate fecha2)`: Retorna la diferencia en días entre dos fechas.
  - `esFechaValida(String fecha)`: Verifica si una cadena representa una fecha válida según el formato esperado.
  - `convertirAFecha(String fecha)`: Convierte una cadena en un objeto `LocalDate`.

**Notas:**
- Utiliza la API de fechas de Java 8 (`java.time`) para mayor precisión y facilidad de uso.
- Incluye métodos auxiliares para operaciones comunes con fechas.

---

### 4. `GestionPersona.java`

**Descripción:**  
Maneja la lógica relacionada con la gestión de personas dentro del sistema, posiblemente asociando fechas específicas a cada persona.

**Componentes principales:**

- **Campos:**
  - `List<Persona> listaPersonas`: Lista que almacena los objetos `Persona` registrados.

- **Métodos:**
  - `agregarPersona(Persona persona)`: Añade una nueva persona a la lista.
  - `eliminarPersona(String id)`: Elimina una persona de la lista según su identificador.
  - `buscarPersona(String id)`: Retorna una persona que coincide con el identificador proporcionado.

**Notas:**
- Asegura que no se registren personas duplicadas.
- Puede integrarse con la interfaz gráfica para mostrar y gestionar personas.

---

### 5. `Persona.java`

**Descripción:**  
Clase que representa a una persona, incluyendo atributos como nombre, identificación y fechas relevantes.

**Componentes principales:**

- **Campos:**
  - `String id`: Identificador único de la persona.
  - `String nombre`: Nombre completo de la persona.
  - `LocalDate fechaNacimiento`: Fecha de nacimiento de la persona.

- **Métodos:**
  - `getEdad()`: Calcula y retorna la edad de la persona basada en su fecha de nacimiento.
  - Métodos getters y setters para cada campo.

**Notas:**
- Implementa métodos `equals` y `hashCode` basados en el identificador para asegurar la unicidad.
- Puede extenderse para incluir más atributos según las necesidades del sistema.
