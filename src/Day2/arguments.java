package Day2;

import java.util.Scanner;

public class arguments {
    public static void main(String[] args) {
        //this class returns Day2.Summary, difference and average
        System.out.print("Enter first number - ");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int value2 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int value3 = scanner.nextInt();
        System.out.println("Day2.Summary - " + value1+value3+value2);
        System.out.println("difference - " + (value1-value2-value3));
        System.out.println("average - " + (value1+value2+value3)/2);
    }
}
