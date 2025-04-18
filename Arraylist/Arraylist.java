import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(1);
        arr.add(2, 1500);
        System.out.println(arr.contains(1500));
        System.out.println(arr.get(2));
    }
}
