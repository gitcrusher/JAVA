package Enum;

enum Month{
    Jan(31), Feb(28), Mar(31);
    int totalDay;
    Month(int day){
        totalDay = day;
    }
    public int getTotalDay() {
        return totalDay;
    }
}

public class enumConstructor {
    public static void main(String[] args) {
        for(Month m : Month.values()) 
        System.out.println(m +" "+ m.getTotalDay());
    }

}