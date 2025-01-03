package Basics;
import java.util.Scanner;
public class exercise1 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks out of subject 1");
    float sub1 = sc.nextFloat();
    System.out.println("Enter marks out of subject 2");
    float sub2 = sc.nextFloat();
    System.out.println("Enter marks out of subject 3");
    float sub3 = sc.nextFloat();
    System.out.println("Enter marks out of subject 4");
    float sub4 = sc.nextFloat();
    System.out.println("Enter marks out of subject 5");
    float sub5 = sc.nextFloat();
    float total = sub1 + sub2 + sub3 + sub4 + sub5;
    float average = (total / 500)*100;
    System.out.println("percentage is "+average+"%");
    sc.close();
    }

}
