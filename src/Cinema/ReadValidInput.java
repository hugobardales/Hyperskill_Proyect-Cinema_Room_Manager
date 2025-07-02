package Cinema;

import java.util.Scanner;

public class ReadValidInput {

    public static int readValidInput (Scanner scanner, String prompt) {
        int number;
        while(true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                // Convertimos el String a Int
                number = Integer.parseInt(input);

                if (number >= 1 && number <= 9) {
                    break;
                } else {
                    System.out.println("WARNING: The number must between 1-9. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("WARNING: Invalid input. Please enter a whole number. Try again.");
            }
        }
        return number;
    }
}
