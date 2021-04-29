import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your age - ");
        int age = scanner.nextInt();
        if (age >= 18)
            System.out.println("You Can Vote");
        else
            System.out.println("You can't Vote  ):");
    }
}
