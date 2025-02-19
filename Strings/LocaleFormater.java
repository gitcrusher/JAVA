package Strings;
import java.util.Locale;

public class LocaleFormater {
    public static void main(String[] args) {
        double amount = 1234.56;

        // US Dollar
        System.out.println(String.format(Locale.US, "US Currency: $%,.2f", amount)); // Output: US Currency: $1,234.56

        // France (Euro Symbol)
        System.out.println(String.format(Locale.FRANCE, "France Currency: €%,.2f", amount)); // Output: France Currency: €1 234,56
    }
}
