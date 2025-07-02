package Cinema;

public class PrintCinema {
    public static void printSeatCinema(char[][] seatsCinema) {
        System.out.println("\nCinema:");
        System.out.print("  ");

        // Bucle para imprimir los números de las columnas
        for (int i = 1; i <= seatsCinema[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bucles para imprimir las filas y asientos
        for (int i = 0; i < seatsCinema.length; i++) {
            System.out.print((i + 1) + " "); // Imprime el número de la fila
            for (int j = 0; j < seatsCinema[i].length; j++) {
                System.out.print(seatsCinema[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}