package Strings;
import java.util.Scanner;
public class neo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Recent Review Rating:"+a+"Stars");
        sc.nextLine();
        String s= sc.nextLine();
        System.out.println("Review Title: "+s+".");
        sc.close();
    }
}
