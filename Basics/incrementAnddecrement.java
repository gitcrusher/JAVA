package Basics;
import java.util.Scanner;
public class incrementAnddecrement {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("increment"+ ++i);
        System.out.println(i);
        System.out.println("decrement"+ --i);
        System.out.println(i);
        sc.close();
    }
}
