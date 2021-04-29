package Day4;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //giving weekday to a number from 1 to 7
        Random random = new Random();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int userNumber = scanner.nextInt();*/
        int weekday  = random.nextInt()%7+1;
        if (weekday == 1)
            System.out.println("Sunday");
        else if(weekday == 2)
            System.out.println("Monday");
        else if(weekday == 3)
            System.out.println("Tuesday");
        else if(weekday == 4)
            System.out.println("Wednesday");
        else if(weekday == 5)
            System.out.println("Thursday");
        else if(weekday == 6)
            System.out.println("Friday");
        else
            System.out.println("Saturday");
    }
}
