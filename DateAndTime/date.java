package DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        DateTimeFormatter a =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(date, a);
        LocalDate updatedDate = parsedDate.minusMonths(1);
        System.out.println(parsedDate);
        System.out.println(updatedDate);
        sc.close();
    }
}
