package Basics;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these number is ");
        System.out.println(sum);
        sc.close();
    }
}
