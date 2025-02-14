package Enum;
enum Day{
    mon, tue, wed, thr, fri, sat, sun
}

public class enum1 {
    public static void main(String[] args) {
        for(Day s: Day.values())
        System.out.println(s +" "+(Day.valueOf(s.toString()).ordinal())); 
    }
}
