package Day4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //giving balls only with 3 and 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much balls do you want - ");
        int ballNumber = scanner.nextInt();
        if (ballNumber != 1 && ballNumber != 2 && ballNumber != 4 && ballNumber != 7)
            System.out.println("I can give you");
        else
            System.out.println("It's not Possible");
    }
}
