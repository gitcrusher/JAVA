package Strings;
import java.util.Scanner;
class stringSwitch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        
        switch (day) {
            case "Monday":
                System.out.println("MOnday");
                break;
            case "tuesday":
                System.out.println("Tuesday");
            default:
                break;
        }
        scanner.close();
    }
}