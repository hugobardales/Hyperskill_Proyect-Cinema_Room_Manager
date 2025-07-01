package Cinema;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsInRow = scanner.nextInt();

        // Creates new char array
        char[][] seatsCinema = new char[rows][seatsInRow];

        // Bucle externo
        for(int i = 0; i < rows; i++) {
            // Bucle interno
            for (int j = 0; j < seatsInRow; j++) {
                seatsCinema[i][j] = 'S';
            }
        }

        // Creates and instantiated a object name cinema
        PrintCinema printCinema = new PrintCinema();
        printCinema.printSeatCinema(seatsCinema);

        System.out.println("Enter a row number:");
        int rowNum = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatRow = scanner.nextInt();

        // Body which calculate the price of seats
        int totalAsientos = rows * seatsInRow;
        int ticketPrice = 0;

        if (totalAsientos <= 60) {
            ticketPrice = 10;
        } else if (totalAsientos > 60) {
            int mitadFilas = rows / 2;
            int filasParteFrontal = mitadFilas;
            if (rowNum <= filasParteFrontal) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }
        System.out.println("Ticket price: $" + ticketPrice);


        // Refresh the map seats of Cinema
        seatsCinema[rowNum - 1][seatRow - 1] = 'B';

        System.out.println();
        printCinema.printSeatCinema(seatsCinema);

    }

}
