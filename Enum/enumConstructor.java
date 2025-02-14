package Enum;

enum Month{
    Jan(31), Feb(28), Mar(31);
    int totalDay;
    Month(int day){
        totalDay = day;
    }
    
}

public class enumConstructor {
    public static void main(String[] args) {
        for(Month m : Month.values()) 
        switch (m) {
            case Jan:
                System.out.println(m.totalDay );
                break;
            case Feb:
                System.out.println(m.totalDay);
                break;
            case Mar:
                System.out.println(m.totalDay);
                break;
            default:
                break;
        }
    }

}