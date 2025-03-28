package DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for date input
        System.out.print("Enter date in format (dd-MM-yyyy): ");
        String userInput = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the date
        try {
            LocalDate userDate = LocalDate.parse(userInput, formatter);
            System.out.println("Parsed Date: " + userDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
        }

        // Close the scanner
        scanner.close();
    }
}
