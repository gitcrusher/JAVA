import java.util.*;
public class basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set= new TreeSet<>(Collections.reverseOrder());
        while(sc.hasNextInt()){
            set.add(sc.nextInt());
        }
        System.out.println(set);
    }    
}
