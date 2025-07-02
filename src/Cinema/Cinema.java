package Cinema;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketBought;
        int currentIncome;

        int continueInnerLoop = 1;
        int continueOuterLoop = 1;
        int outerLoop = 1;


        // Creates and instantiated a object name cinema
        PrintCinema printCinema = new PrintCinema();


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


        do {
            switch (choiceMenu(scanner)) {
                case 1:
                    do {
                        printCinema.printSeatCinema(seatsCinema);

                        System.out.println("Continue with this choice ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = scanner.nextInt();
                        break;

                    } while (continueInnerLoop == 1);

                case 2:

                    do {
                        int rowNum = 0;
                        int seatRow = 0;

                        System.out.println("Enter a row number:");
                        rowNum = scanner.nextInt();

                        System.out.println("Enter a seat number in that row:");
                        seatRow = scanner.nextInt();

                        if (rowNum > rows || seatRow > seatsInRow) {
                            System.out.println("Wrong input. Enter a valid parameter minor that " + rows + " " + seatsInRow);
                            continue;

                        }

                        if () {
                            // Refresh the map seats of Cinema
                            seatsCinema[rowNum - 1][seatRow - 1] = 'B';

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
                        }

                        System.out.println("Continue with this choice ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = scanner.nextInt();

                    } while (continueInnerLoop == 1);

            }
            System.out.println("Continue with this choice ? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = scanner.nextInt();

        } while (continueOuterLoop == 1);


    }

    public static int choiceMenu (Scanner scanner) {
        int choiceGivenUser;

        System.out.println("1. Show seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit ");

        // The user choose a number 1 to 3 and 0 from the scanner input
        choiceGivenUser = scanner.nextInt();

        // Return a value
        return choiceGivenUser;

    }
}
