package Day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //determining even number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number - ");
        int number = scanner.nextInt();
        if(number%2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
