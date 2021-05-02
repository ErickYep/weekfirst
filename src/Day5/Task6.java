package Day5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Finding greatest number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number - ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number - ");
        int number3 = scanner.nextInt();
        int maximum = (number1 >= number2 && number1 >= number3) ? number1
                : (number2 >= number3 && number2 >= number1) ? number2
                : (number3 >= number1 && number3 >= number2) ? number3
                : 0;
        System.out.println("Greatest value is - " + maximum);
    }
}
