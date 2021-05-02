package Day5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Mini Calculator(/,*,-,+)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number - ");
        int number1 = scanner.nextInt();
        System.out.println("Enter your Second number - ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the operation (+,-,*,/) - ");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.print(number1 + " ");
                System.out.print(operator + " ");
                System.out.print(number2);
                System.out.println(" = " + (number1 + number2));
                break;
            case'-':
            System.out.print(number1 + " ");
            System.out.print(operator + " ");
            System.out.print(number2);
            System.out.println(" = " + (number1 - number2));
            break;
            case'*':
            System.out.print(number1 + " ");
            System.out.print(operator + " ");
            System.out.print(number2);
            System.out.println(" = " + (number1 * number2));
                break;
            case'/':
                System.out.print(number1 + " ");
                System.out.print(operator + " ");
                System.out.print(number2);
                System.out.println(" = " + (number1 / number2));
                break;
            default:
                System.out.println("You Entered wrong operator");
        }
    }
}
