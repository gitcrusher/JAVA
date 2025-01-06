package Strings;

public class fprintformat {
    public static void main(String[] args) {
        int a = 2567;
        float b = 3.32256434f;
        //System.out.printf("The folloing formating tells you that a is %d and b is %f",a,b);
        System.out.format("The folloing formating tells you that a is %d and b is %.2f",a,b);
    }
    
}
