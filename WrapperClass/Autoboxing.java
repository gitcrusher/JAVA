package WrapperClass;
import java.util.Scanner;
public class Autoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();//wrapper class
        System.out.println(num.intValue());//
        sc.close();
    }
}
