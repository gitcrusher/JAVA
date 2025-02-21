package Strings;

public class StringExecutiontime {
    public static void main(String[] args) {

        long starttime = System.nanoTime();
        String current = null;
        for(char alpha = 'a';alpha<= 'z' ; alpha ++){
            current = current+alpha;   
        }
        long endtime = System.nanoTime();
        System.out.println("time Taken by String "+(endtime - starttime));
        
        
        starttime = System.nanoTime();
        StringBuilder current1 = new StringBuilder();
        for(char alpha = 'a';alpha<= 'z' ; alpha ++){
            current1 = current1.append(alpha);
        }
        endtime= System.nanoTime();
        System.out.println("Time taken by String Builder "+(endtime-starttime));
    }
}
