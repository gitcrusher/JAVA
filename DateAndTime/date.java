package DateAndTime;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class date {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get date input in dd-MM-yyyy format
        System.out.print("Enter date in format (dd-MM-yyyy): ");
        String date = sc.nextLine();

        // Define input date format
        DateTimeFormatter a = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse the user input date
        LocalDate parsedDate = LocalDate.parse(date, a);

        // Subtract 1 month from the parsed date
        LocalDate updatedDate = parsedDate.minusMonths(1);

        // Get the month name of the updated date
        Month month = updatedDate.getMonth();

        // Define a new format to display updated date in dd-MMMM-yyyy
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String formatString = updatedDate.format(newFormat);

        // Get the length of the original month
        int lastDay = parsedDate.lengthOfMonth();

        // Get the last day of the original month
        LocalDate lastDayOfMonth = updatedDate.withDayOfMonth(lastDay);

        // Format the last day of the month to desired format
        String formattedDate = lastDayOfMonth.format(newFormat);

        // Print results
        System.out.println("Parsed Date: " + parsedDate);
        System.out.println("Date after subtracting 1 month: " + formatString);
        System.out.println("Last Day of the Original Month: " + formattedDate);

        // Close the scanner
        sc.close();
    }
}