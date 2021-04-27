import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        //return second digit of your 3-digit number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number - ");
        int number = scanner.nextInt();
        System.out.println("second digit of your number is - " + number / 10 % 10);
    }
}
