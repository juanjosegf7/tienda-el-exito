# Sistema de Gestión de Inventario - Tienda El Éxito

## 1. Descripción del proyecto

Este proyecto consiste en el desarrollo de una aplicación de consola en Java para gestionar los productos de una tienda de barrio llamada **Tienda El Éxito**.

El sistema permite registrar productos alimenticios y electrónicos, almacenarlos en memoria, buscarlos mediante su código y consultar el inventario completo.

El desarrollo aplica conceptos de programación orientada a objetos, estructuras de datos y manejo de excepciones, buscando mantener un código organizado, reutilizable y fácil de comprender.

## 2. Objetivo

Implementar un sistema básico de gestión de inventario utilizando Java, aplicando abstracción, herencia, encapsulamiento, polimorfismo, colecciones y manejo de excepciones.

## 3. Tecnologías utilizadas

- **Java JDK 21 LTS:** lenguaje y entorno de desarrollo.
- **Visual Studio Code:** editor utilizado para desarrollar el proyecto.
- **Git:** herramienta para controlar las versiones del código.
- **GitHub:** plataforma para almacenar el repositorio.
- **HashMap:** estructura de datos para almacenar y consultar productos.

El proyecto utiliza Java estándar y no requiere Maven, Gradle, Spring Boot ni librerías externas.

## 4. Funcionalidades implementadas

El sistema permite:

- Crear productos alimenticios y electrónicos.
- Registrar productos en el inventario.
- Almacenar cada producto utilizando su código como clave.
- Buscar productos por su código.
- Consultar el listado completo del inventario.
- Identificar cuando el inventario está vacío.
- Manejar mediante una excepción personalizada la búsqueda de productos inexistentes.
- Mostrar mensajes de información y error en español.

## 5. Estructura del proyecto

```text
store-inventory/
│
├── src/
│   └── com/
│       └── store/
│           ├── model/
│           │   ├── Product.java
│           │   ├── FoodProduct.java
│           │   └── ElectronicProduct.java
│           │
│           ├── service/
│           │   └── Inventory.java
│           │
│           ├── exception/
│           │   └── ProductNotFoundException.java
│           │
│           └── StoreApp.java
│
├── docs/
│   └── evidence/
│       └── inventory-tests.png
│
├── .gitignore
└── README.md
```

La carpeta `out` se genera durante la compilación y contiene los archivos `.class`. No se incluye en el repositorio porque está excluida mediante `.gitignore`.

## 6. Descripción de las clases

| Clase                      | Responsabilidad                                                      |
| -------------------------- | -------------------------------------------------------------------- |
| `Product`                  | Representa las características comunes de los productos.             |
| `FoodProduct`              | Representa los alimentos e incorpora su fecha de caducidad.          |
| `ElectronicProduct`        | Representa los productos electrónicos e incorpora el voltaje.        |
| `Inventory`                | Administra el almacenamiento, búsqueda y visualización de productos. |
| `ProductNotFoundException` | Maneja la situación en la que no se encuentra un producto.           |
| `StoreApp`                 | Contiene el método `main()` y ejecuta las pruebas funcionales.       |

## 7. Requisitos para ejecutar el proyecto

Se necesita:

- Windows 10 u 11, o un sistema compatible con Java.
- Java JDK 21 instalado.
- Una terminal para compilar y ejecutar la aplicación.
- Visual Studio Code, recomendado para revisar y modificar el código.

Para comprobar la instalación de Java:

```powershell
java -version
javac -version
```

Ambos comandos deben mostrar la versión 21.

## 8. Compilación y ejecución

Los siguientes comandos se ejecutan desde la carpeta raíz del proyecto, utilizando PowerShell.

### Compilar

```powershell
javac -encoding UTF-8 -d out src/com/store/model/*.java src/com/store/exception/*.java src/com/store/service/*.java src/com/store/StoreApp.java
```

Este comando compila las clases Java y genera los archivos correspondientes dentro de `out`.

### Ejecutar

```powershell
java -cp out com.store.StoreApp
```

La aplicación mostrará los resultados de las pruebas funcionales desde la consola.

## 9. Pruebas funcionales

Se implementaron cinco escenarios de prueba:

| Prueba                | Resultado esperado                                 |
| --------------------- | -------------------------------------------------- |
| Inventario vacío      | Informar que no existen productos registrados.     |
| Registro de productos | Almacenar tres productos.                          |
| Búsqueda exitosa      | Encontrar y mostrar el producto `A001`.            |
| Búsqueda fallida      | Mostrar el error correspondiente al código `A999`. |
| Inventario completo   | Mostrar los tres productos registrados.            |

Las cinco pruebas se ejecutaron correctamente.

Las evidencias de ejecución se encuentran en `docs/evidence/`, una vez incorporada la captura correspondiente.

## 10. Consideraciones

El inventario utiliza `HashMap`, por lo que no se garantiza un orden específico al mostrar los productos.

La información se almacena únicamente en memoria durante la ejecución. Al finalizar el programa, los productos no se conservan en una base de datos o archivo.

Si se registra nuevamente un código existente, la implementación actual reemplaza el producto asociado a ese código.

El sistema corresponde a una aplicación académica de consola y no incluye interfaz gráfica ni base de datos.

## 11. Estado del proyecto

Se completaron las fases de configuración, implementación del modelo, gestión del inventario, manejo de excepciones y pruebas funcionales.

El proyecto cumple funcionalmente los escenarios solicitados en el enunciado académico.
