import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // To consume the newline character after nextInt()

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // Consume the newline left after reading int
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            map.put(roll, name);
        }

        System.out.println("\n--- Student Details ---");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("Roll No is: " + m.getKey() + " and Name is: " + m.getValue());
        }

        System.out.println("\nComplete HashMap: " + map);
        sc.close();
    }
}
