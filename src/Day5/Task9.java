package Day5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //test` Answer the question
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "   a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        char answer = scanner.next().charAt(0);
        switch(answer){
            case 'b':
                System.out.println("Congratulations");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
