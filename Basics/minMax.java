import java.util.*;
public class minMax {
    static public int max(int a , int b ){
        return (a+b + Math.abs(a-b))/2;
    }
    static public int min(int a , int b ){
        return (a+b - Math.abs(a-b))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max(a,b));
        System.out.println(min(a,b));
    }
}
