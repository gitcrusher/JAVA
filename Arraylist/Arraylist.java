import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        String a=  arr.tostring();
        String b = a.toUpperCase();
        
        arr.add(10);
        arr.add(1);
        arr.add(2, 1500);
        for(int i = 0 ; i < 5;i++){
            
            arr.add(i,sc.nextInt());
        }
System.out.println("print: \n");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(arr.get(i));
        }
        arr.remove(1);
        System.out.println(arr.contains(1500));
        System.out.println(arr.get(1));
    }
}
