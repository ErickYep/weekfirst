import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        System.out.print("Enter first number - ");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int value2 = scanner.nextInt();
        System.out.println(value1);
        System.out.println(value2);
        value1 = value2 + value1;
        value2 = value1 - value2;
        value1 = value1 - value2;
        System.out.println(value1);
        System.out.println(value2);
    }
}
