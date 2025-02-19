package MethodOverloading;

public class StringArray {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Bye");
        System.out.println(a + " "+b);    
        char c[] = {'c', 'b', 'g', 'h', 'o', 'p'}; // Corrected 'char' declaration
        String cc = new String(c, 0, 6); // Creates a substring from index 1 of length 2
        System.out.println(cc); // Output: "bg"

        byte[] bytes = {65, 66, 67, 68}; // ASCII values for "ABCD"
        String byteString = new String(bytes);
        System.out.println(byteString); // Output: "ABCD"

        char[] chars = {'X', 'Y', 'Z'};
        String charString = new String(chars);
        System.out.println(charString); 

        
        System.out.println(byteString+" "+charString); // Output
    }
}