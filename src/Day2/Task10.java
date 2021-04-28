package Day2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //returns last digit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int i = scanner.nextInt();
        System.out.println("last digit of your number is - " + i%10);
    }
}
