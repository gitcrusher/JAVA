
import java.util.*;

public class arraySort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
        list1.add(sc.nextInt());
        }
        
        int b = sc.nextInt();
        

        for(int i = 0; i < b; i++){
            list2.add(sc.nextInt());
        }
        
        list1.addAll(list2);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        
        
    }
}