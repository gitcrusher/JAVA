package Strings;

public class BUilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        StringBuilder sb3 = new StringBuilder('a');
        StringBuilder sb4 = new StringBuilder("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        System.out.println(sb4.length());
        System.out.println(sb4.capacity());
    }
}
