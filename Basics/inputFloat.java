package Basics;
import java.util.Scanner;
public class inputFloat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float number");
        float a = sc.nextFloat();
        System.out.println(a);
        sc.close();
    }
}
