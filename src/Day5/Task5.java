package Day5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //using ternary operator on more than 1 actions
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text - ");
        String text = scanner.nextLine();
        int answer = (text.equals(" ")) ? 0 : (text.equals("")) ? -1 : 0;
        System.out.println(answer);
    }
}
