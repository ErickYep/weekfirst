package Day4;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //Finding how much numbers equals each other
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number - ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number - ");
        int number3 = scanner.nextInt();
        if(number1 == number3){
            if(number1 == number2)
                System.out.println(3);
            else
                System.out.println(2);
        }else if(number3 == number2)
            System.out.println(2);
        else if(number1 == number2)
            System.out.println(2);
        else
            System.out.println("There is no equal numbers");
    }
}
