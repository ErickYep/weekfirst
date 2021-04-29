package Day4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //printing greatest numer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNum = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNum = scanner.nextInt();
        if (firstNum > secondNum) {
            if (firstNum > thirdNum)
                System.out.println("Greatest number is - " + firstNum);
            else
                System.out.println("Greatest number is - " + thirdNum);

        } else if (secondNum > thirdNum)
            System.out.println("Greatest number is - "+secondNum);
        else
            System.out.println("Greatest number is - " + thirdNum);
    }
}
