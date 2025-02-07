package MethodOverloading;

public class StringFormatter {
    


    static void formatString(String format, Object... values) {
        System.out.println(String.format(format, values));
    }

    public static void main(String[] args) {
        formatString("Hello, %s!", "Alice");
        formatString("You have %d new messages.", 5);
        formatString("Temperature: %.2f°C", 27.456);
    }
}