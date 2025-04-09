

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Stream2inJava {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("name.txt");
            fos.write(sc.nextLine().getBytes(),3,6);
            System.out.println("Data Stored");
            FileInputStream fis = new FileInputStream("name.txt");

        }catch(IOException e){
            System.out.println("Not Stored");
        }
    }
}
