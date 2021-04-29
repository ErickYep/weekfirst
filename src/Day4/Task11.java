package Day4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //it's a programm where deciading is a and b corresponds for following requirements
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number - ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number - ");
        int b = scanner.nextInt();
        //11.1
        if (a > 10) {
            if (b % 10 != 0)
                System.out.println("Both a and b legal");
            else
                System.out.println("a is legal, b is illegal");
        } else if (b % 10 != 0)
            System.out.println("b is legal, a is illegal");
        else System.out.println("Both a and b illegal");
        //11.2
        if (a > 0) {
            if (b > 0)
                System.out.println("Both a and b legal");
            else
                System.out.println("a is legal, b is illegal");
        } else if (b > 0)
            System.out.println("b is legal, a is illegal");
        else System.out.println("Both a and b illegal");
        //11.3
        if (a < 0) {
            if (b < 0)
                System.out.println("Both a and b legal");
            else
                System.out.println("a is legal, b is illegal");
        } else if (b < 0)
            System.out.println("b is legal, a is illegal");
        else System.out.println("Both a and b illegal");
        //11.4
        if (a % 2 == 1 && b % 2 == 1)
            if (a > 10 && b < 1)
                System.out.println("Both a and b legal");
            else if (a > 10)
                System.out.println("a is legal, b is illegal");
            else if (b < 1)
                System.out.println("b is legal, a is illegal");
            else
                System.out.println("Both a and b illegal");
        //11.5
        if (a % 5 == 0) {
            if (b % 5 == 0)
                System.out.println("Both a and b legal");
            else
                System.out.println("a is legal, b is illegal");
        } else if (b % 5 == 0)
            System.out.println("b is legal, a is illegal");
        else
            System.out.println("Both a and b illegal");
        //11.6
        if (a % 5 != 0) {
            if (b % 5 == 0)
                System.out.println("Both a and b legal");
            else
                System.out.println("a is legal, b is illegal");
        } else if (b % 5 == 0)
            System.out.println("b is legal, a is illegal");
        else
            System.out.println("Both a and b illegal");
    }
}
