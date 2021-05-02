package Day5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Checking number for Odd or Even
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number - ");
        int number = scanner.nextInt();
        int oddOrEven;
        if(number == 0)
            oddOrEven = 15;
        else
            oddOrEven = number % 2;
        switch(oddOrEven) {
            case 1:
                System.out.println("your number is Odd");
                break;
            case 0:
                System.out.println("your number is Even");
                break;
            case 15:
                System.out.println("It's null number");
                break;

        }
    }
}
