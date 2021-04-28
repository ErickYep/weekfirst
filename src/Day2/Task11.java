package Day2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //returns values of a and b and calculates reminder
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a - ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b - ");
        int b = scanner.nextInt();
        System.out.println("a = "+ a + "\nb = " + b + "reminder is - " + a % b);
    }
}
