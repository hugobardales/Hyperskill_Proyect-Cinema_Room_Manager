# Proyecto Simulador de Cine 🍿

Este es un sencillo programa de consola en Java que simula la compra de una entrada en una sala de cine. El programa permite al usuario definir el tamaño de la sala, ver la disposición de los asientos, elegir uno y calcular su precio.

---

## Funcionalidades implementadas ⚙️

1.  **Creación dinámica de la sala:** El programa solicita al usuario el número de filas y asientos para crear una sala de cine a medida.
2.  **Visualización de asientos:** Muestra una cuadrícula con todos los asientos, marcando los disponibles con una 'S' (Seat).
3.  **Cálculo de precios:** Determina el precio del ticket basándose en dos reglas:
    * **Salas pequeñas:** Si el total de asientos es 60 o menos, todos los tickets cuestan $10.
    * **Salas grandes:** Si hay más de 60 asientos, los de la mitad frontal cuestan $10 y los de la mitad trasera cuestan $8.
4.  **Selección y compra:** El usuario puede elegir un asiento por su número de fila y columna.
5.  **Actualización del mapa:** Después de la compra, el programa vuelve a mostrar el mapa de la sala, marcando el asiento comprado con una 'B' (Booked).

---

## Conceptos de Java aplicados 💻

Este proyecto aplica varios conceptos fundamentales de Java para su funcionamiento:

* **Entrada de usuario (`java.util.Scanner`):** Se utiliza para capturar los datos que el usuario introduce por consola, como las dimensiones de la sala y el asiento elegido.

* **Arrays bidimensionales (`char[][]`):** El concepto central del programa. Se usa un array 2D de caracteres para modelar la sala de cine, donde cada posición `[fila][columna]` representa un asiento y su estado ('S' o 'B').

* **Bucles anidados (`for`):** Son esenciales para inicializar y recorrer el array bidimensional. El bucle externo recorre las filas y el interno recorre las columnas de cada fila.

* **Lógica condicional (`if-else`):** Se usa para implementar la lógica de negocio del cálculo de precios, diferenciando entre salas grandes y pequeñas y, dentro de estas, entre asientos delanteros y traseros.

* **Métodos estáticos (`public static void`):** El código está organizado en métodos para mejorar su legibilidad y reutilización. Se destaca el método `printSeatCinema()`, que encapsula toda la lógica para imprimir el estado actual de la sala, evitando así repetir código.
