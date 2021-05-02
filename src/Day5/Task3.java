package Day5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Deciding Negative or positive  or 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number - ");
        int number = scanner.nextInt();
        if(number == 0)
            System.out.println(0);
        else
            System.out.println((number > 0) ? "positive" : "negative");
    }
}
