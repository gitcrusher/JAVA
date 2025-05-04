import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0 ; i<n-1; i+=2){
            int temp = list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,temp);
        }

        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
