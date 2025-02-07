package MethodOverloading;

import java.util.Locale;
import java.util.ResourceBundle;

public class Mutilingual {
    static void printMessage(Locale locale, String key, Object... values) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        System.out.println(String.format(bundle.getString(key), values));
    }

    public static void main(String[] args) {
        printMessage(Locale.ENGLISH, "greeting", "Alice");
        printMessage(Locale.FRENCH, "greeting", "Alice");
    }
}