package Day2;

import java.util.Scanner;

public class Product {
public static void main(String[] args) {
        // producting 2 numbers
        System.out.print("Enter first number - ");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int value2 = scanner.nextInt();
        System.out.println("your product number  is - " + value1*value2);
    }
}
