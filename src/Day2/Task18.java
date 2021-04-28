package Day2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        //return summary of digits of your 3-digit number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number - ");
        int number = scanner.nextInt();
        System.out.println(" summary of digits of your 3-digit number is - " + (number % 10) + (number / 10 % 10) + (number / 100 % 10));
    }
}
