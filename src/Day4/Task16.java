package Day4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        //Solving ax2 + bx + c = 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number - ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number - ");
        double c = scanner.nextDouble();
        double Determinate = Math.pow(b, 2) - 4 * a * c;
        double firstX;
        double secondX;
        if (Determinate < 0)
            System.out.println("Can't be");
        else {
            firstX = (-b + Math.sqrt(Determinate)) / 2 * a;
            secondX = (-b - Math.sqrt(Determinate)) / 2 * a;
            System.out.println(firstX);
            System.out.println(secondX);
        }
    }
}
