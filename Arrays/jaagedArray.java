
import java.util.*;

public class jaagedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ROws: ");
        int rows = sc.nextInt();
        int jaaged [] [] = new int [rows][];
        for(int i = 0 ; i < rows ; i++){
            System.out.println("Enter col Value"+ (i+1) );
            int cols = sc.nextInt();
            jaaged[i] = new int [cols] ;
            for(int j = 0 ; j < cols ; j++){
                jaaged[i][j] = sc.nextInt();
        }
    }
    System.out.println("\nThe Jagged Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <jaaged[i].length; j++) {
                System.out.print(jaaged[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();  //
}
}
