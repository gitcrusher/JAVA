package Basics;
import java.util.Scanner;
public class exercise2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        grade = (char)(grade + 2);
        System.out.println("after typecasting: "+ grade);
        sc.close();
    }
}
