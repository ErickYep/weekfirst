import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //Deciding is this number is odd or even
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int number = scanner.nextInt();
        int reminder = number%2;
        boolean odd ;
        if (reminder == 0) {
            odd = true;
            System.out.println("your number is odd");
        }
        else {
            odd = false;
            System.out.println("your number is even");
        }
    }
}
