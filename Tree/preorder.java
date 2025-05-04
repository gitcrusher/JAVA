
import java.util.*;




public class preorder {
    public static void main(String[] args) {
        TreeSet <String> tree = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno\n");
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        tree.add(a+" "+b);
        System.out.println(tree);
    }
}
