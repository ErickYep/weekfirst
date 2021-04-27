import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        //returns reminder
        System.out.print("Enter first number - ");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int value2 = scanner.nextInt();
        System.out.println("your remainder number  is - " + value1%value2);
    }
}
