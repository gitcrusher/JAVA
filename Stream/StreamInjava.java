import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamInjava {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("name.txt");
            fos.write(sc.nextLine().getBytes(),8,6);
            System.out.println("Data Stored");
        }catch(IOException e){
            System.out.println("Not Stored");
        }
    }
}
