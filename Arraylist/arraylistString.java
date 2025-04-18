import java.util.*;

public class arraylistString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            arr.add(i,sc.nextLine());
        }
        for(int i = 0 ; i < 5 ; i++){
            
            arr2.add((arr.get(i).toUpperCase()));
        }
        for(int i = 0 ; i < 5 ; i++){
            
            System.out.println(arr2.get(i));
        }

        // String b = arr2.toUpperCase();

}
}
