package Day4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //deciding whether number is multiple of a 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();
        if(number%5==0)
            System.out.println("This number is a multiple of a 5");
        else
            System.out.println("This number isn't a multiple of a 5");

    }
}
