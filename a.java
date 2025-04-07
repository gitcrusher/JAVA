import java.util.Scanner;


class StringManipulation {
    public static String replaceWithStringBuilder(String originalString, String toReplace, String replacement){
        originalString = originalString.replaceAll(toReplace,replacement);
        return originalString;
    }
}

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalString = scanner.nextLine();   // e.g., "hello world"
        String toReplace = scanner.nextLine();        // e.g., "world"
        String replacement = scanner.nextLine();      // e.g., "Java"

        String replacedString = StringManipulation.replaceWithStringBuilder(originalString, toReplace, replacement);

        System.out.println(originalString);
        System.out.println(replacedString);

        scanner.close();
    }

}
