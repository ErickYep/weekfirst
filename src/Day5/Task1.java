package Day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //testing what will be if we compare string with ==
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text 1 - ");
        String text1 = scanner.nextLine();
        System.out.print("Enter Text 2 - ");
        String text2 = scanner.nextLine();
        String answer = (text1 == text2) ? "Texts are same" : "Texts aren't same";
        System.out.println(answer);
        //Answer is false, but must be true
        String answer1 = (text1.equals(text2)) ? "Texts are same" : "Texts aren't same";
        System.out.println(answer1);
        //Right version of comparing is Equals
    }
}
