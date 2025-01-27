package WrapperClass;
import java.util.Scanner;
public class Autoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();//wrapper class
        int a = 10 ;
        System.out.println(num);//autoboxing
        System.out.println(num.intValue());//manual unboxing
        sc.close();
    }
}
