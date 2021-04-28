package Day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //finding char value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nummber - ");
        int number = scanner.nextInt();
        char character = (char) number;
        System.out.println(number + "-" + character);
    }
}
