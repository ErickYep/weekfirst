package Day5;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        //returning int for week days
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Week day - ");
        String weekDay = scanner.next();
        switch (weekDay) {
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Unexpected Weekday");
        }
    }
}