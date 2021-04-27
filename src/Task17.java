import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //return first digit of your 3-digit number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number - ");
        int number = scanner.nextInt();
        System.out.println("first digit of your number is - " + number / 100 % 10);
    }
}
