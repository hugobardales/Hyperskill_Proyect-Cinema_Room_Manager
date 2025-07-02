package Cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(":::::::WELCOME - CINEMA MANAGER::::::::");
        System.out.println("Setting the dimension of your Cinema");
        System.out.println("------------------------------------");

        // Reading row and seatInRow from the input user
        int rows = ReadValidInput.readValidInput(scanner, "Enter the number of rows (1-9):");
        int seatsInRow = ReadValidInput.readValidInput(scanner, "Enter the number of Seat in Row (1-9):");

        char[][] seatsCinema = new char[rows][seatsInRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                seatsCinema[i][j] = 'S';
            }
        }

        // Variables para estadísticas
        int ticketsBought = 0;
        int currentIncome = 0;
        int totalSeats = rows * seatsInRow;

        boolean continueMenu = true;
        while (continueMenu) {
            int choice = choiceMenu(scanner);

            switch (choice) {
                case 1:
                    PrintCinema.printSeatCinema(seatsCinema);
                    break;

                case 2:
                    buyTicket(scanner, seatsCinema, ticketsBought, currentIncome, totalSeats);
                    // Actualizamos las estadísticas (esto es una simplificación, en un caso real se pasaría un objeto)
                    ticketsBought++;
                    currentIncome += calculateTicketPrice(scanner.nextInt(), rows, totalSeats); // Se necesita recalcular para el ingreso
                    break;

                case 3:
                    showStatistics(ticketsBought, currentIncome, totalSeats);
                    break;

                case 0:
                    continueMenu = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    public static int choiceMenu(Scanner scanner) {
        System.out.println("\n:::MENU CINEMA:::");
        System.out.println("1. Show seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.println("Choice a option 0-3:");
        return scanner.nextInt();
    }

    public static void buyTicket(Scanner scanner, char[][] seats, int ticketsBought, int currentIncome, int totalSeats) {
        int rowNum;
        int seatNum;

        while (true) {
            System.out.println("\n:::::::::BUY TICKET:::::::::");
            System.out.println("Enter a row number:");
            rowNum = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNum = scanner.nextInt();

            // Validación de rango
            if (rowNum < 1 || rowNum > seats.length || seatNum < 1 || seatNum > seats[0].length) {
                System.out.println("Wrong input! Please enter a valid seat.");
                continue; // Vuelve al inicio del bucle
            }

            // Validación de disponibilidad
            if (seats[rowNum - 1][seatNum - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                continue; // Vuelve al inicio del bucle
            }

            // Si todo es correcto, salimos del bucle de validación
            break;
        }

        int ticketPrice = calculateTicketPrice(rowNum, seats.length, totalSeats);
        System.out.println("Ticket price: $" + ticketPrice);

        // Marcamos el asiento y actualizamos
        seats[rowNum - 1][seatNum - 1] = 'B';

        System.out.println("\nPress any button to back MENU CINEMA.");
    }

    public static int calculateTicketPrice(int rowNum, int totalRows, int totalSeats) {
        if (totalSeats <= 60) {
            return 10;
        } else {
            int frontHalf = totalRows / 2;
            return (rowNum <= frontHalf) ? 10 : 8;
        }
    }

    public static void showStatistics(int ticketsBought, int currentIncome, int totalSeats) {
        double percentage = ((double) ticketsBought / totalSeats) * 100;
        int totalIncome = calculateTotalPossibleIncome(totalSeats, totalSeats / 9, 9); // Asumiendo 9 asientos por fila para un cálculo genérico

        System.out.println("\n:::STATISTICS:::");
        System.out.printf("Tickets bought: %d\n", ticketsBought);
        System.out.printf("Percentage of seats sold: %.2f%%\n", percentage);
        System.out.printf("Current income: $%d\n", currentIncome);
        System.out.printf("Total possible income: $%d\n", totalIncome);
    }

    public static int calculateTotalPossibleIncome(int totalSeats, int totalRows, int seatsPerRow) {
        if (totalSeats <= 60) {
            return totalSeats * 10;
        } else {
            int frontHalf = totalRows / 2;
            int backHalf = totalRows - frontHalf;
            return (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8);
        }
    }
}