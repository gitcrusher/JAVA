import java.util.*;
public class hasmaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        while(sc.hasNext()){
            if (sc.hasNextInt()) {
                int roll= sc.nextInt();
                String name = sc.next();
                map.put(roll,name);
            }else{
                break;
            }
        }
        TreeMap<Integer, String> sortedMap= new TreeMap<>(map);
        for(Map.Entry<Integer, String> entry: sortedMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
