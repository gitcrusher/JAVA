package MethodOverloading;
import java.util.*;
public class VArAgrs {
    public void  add(int...agr){
        int sum = 0 ; 
        for(int data : agr){
            sum += data;
        }
        System.out.printf("Sum is: %d", sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VArAgrs obj = new VArAgrs();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        obj.add(a,b,c);
        sc.close();
    }
}
