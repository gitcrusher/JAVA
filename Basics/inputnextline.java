package Basics;
import java.util.Scanner;

public class inputnextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        sc.close(); // always close the scanner to avoid resource leakage
    }
}