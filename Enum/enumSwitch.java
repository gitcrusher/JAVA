package Enum;
import java.util.*;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class enumSwitch {
    public static void main(String[] args) {
        for(Days s:Days.values())
        switch (s) {
            case MONDAY:
                System.out.println("this is MOnday");
                break;
            case TUESDAY:
                System.out.println("this is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("this is wednesday");
                break;
            case THURSDAY:
                System.out.println("this is thrusday");
                break;
            case FRIDAY:
                System.out.println("this is friday");
                break;
            case SATURDAY:
                System.out.println("this is Saturday");
                break;
            case SUNDAY:
                System.out.println("this is a weekday");
                break;
            default:
                break;
        }
    }
}
