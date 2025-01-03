package Basics;
import java.util.Scanner;
public class inputHasNEXT {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
    }
    
}
