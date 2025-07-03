# Cinema Room Manager - Projecto en Java

Este proyecto CLI en Java, simula un sistema de gestión de una sala de cine. Fue desarrollado para aplicar y demostrar conceptos fundamentales de programación en Java, incluyendo la programación orientada a objetos, manejo de excepciones, la gestión de datos y la creación de una interfaz de usuario interactiva en la consola.

---

## 📋 Funcionalidades (Features)

* **Configuración Dinámica:** La sala de cine se genera dinámicamente según las dimensiones (filas y asientos) especificadas por el usuario.
* **Menú Interactivo:** Un menú persistente permite al usuario navegar por las diferentes funcionalidades de la aplicación hasta que decide salir.
* **Compra de Tickets con Validación:** Sistema de compra que valida en tiempo real:
    * Que las coordenadas del asiento existan dentro de la sala.
    * Que el asiento no haya sido comprado previamente.
* **Cálculo de Precios:** Lógica de negocio que asigna precios a los tickets basándose en el tamaño de la sala y la ubicación de la fila, la primera mitad de la fila tiene un precio de $10 y la segunda mitad de la fila $8.
* **Estadísticas en Tiempo Real:** Muestra un resumen de la operación, incluyendo el número de tickets vendidos, el porcentaje de ocupación, los ingresos actuales y los ingresos totales posibles.
* **Entrada de Datos Robusta:** Manejo de errores para asegurar que el usuario solo pueda introducir datos numéricos válidos donde sea requerido.

---

## 🛠️ Habilidades Técnicas Demostradas

Este proyecto evidencia la aplicación práctica de las siguientes competencias técnicas:

* **Programación Orientada a Objetos (POO):**
    * **Encapsulamiento y Separación de Responsabilidades:** El código está estructurado en múltiples clases (`Cinema`, `PrintCinema`, `ReadValidInput`), cada una con una responsabilidad única, lo que demuestra un diseño de software limpio y mantenible.

* **Estructuras de Datos Fundamentales:**
    * Uso de **arrays bidimensionales (`char[][]`)** para modelar una estructura de datos compleja como un mapa de asientos y gestionar su estado (`disponible`, `ocupado`).

* **Manejo de Errores y Excepciones (`try-catch`):**
    * Implementación de un sistema robusto de validación de entradas que utiliza `try-catch` para manejar `NumberFormatException`, previniendo caídas del programa por datos no válidos.

* **Algoritmos y Lógica de Programación:**
    * Desarrollo de bucles de control (`while`) y estructuras condicionales (`switch`, `if-else`) para gestionar el flujo del programa y la lógica de negocio.
    * Implementación de algoritmos para el cálculo de precios y estadísticas.

* **Diseño de Componentes Reutilizables:**
    * La clase `ReadValidInput` fue creada como un componente modular y reutilizable para la validación de entradas, demostrando la capacidad de escribir código DRY (Don't Repeat Yourself).

* **Gestión de la Interacción con el Usuario (UI de Consola):**
    * Habilidad para crear una experiencia de usuario clara y funcional a través de la línea de comandos, incluyendo menús y prompts informativos.

---

## 📂 Estructura del Código

El proyecto está organizado en tres clases para una máxima cohesión y bajo acoplamiento:

* `Cinema.java`: La clase principal que contiene la lógica de negocio (`main`), el menú principal, el cálculo de precios y la gestión de estadísticas. Orquesta las llamadas a los otros componentes.
* `PrintCinema.java`: Una clase de utilidad con una única responsabilidad: renderizar y mostrar el estado actual del mapa de asientos en la consola.
* `ReadValidInput.java`: Un componente de validación robusto y reutilizable que garantiza que la entrada del usuario sea un número entero dentro de un rango específico.

---

## 🚀 Cómo Ejecutar el Proyecto

1.  **Descargamos CinemaRoomManager.jar**
   
2.  **Navegar al directorio de la carpeta de descarga:**
 
3.  **Abrimos una terminal**
   
4.  **Ejecutar la aplicación:**
![Demostración del ejecutable](https://github.com/hugobardales/Hyperskill_Proyect-Cinema_Room_Manager/blob/main/assests/CinemaRoomManager.gif)

    
