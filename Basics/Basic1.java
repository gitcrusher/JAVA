package Basics;
import java.util.Scanner;



public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        System.out.println("the data is long which is "+start);
        System.out.println("the data is too long");
        sc.close();
    }
}
