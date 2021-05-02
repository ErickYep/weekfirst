package Day5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Checking char vowel or consonant
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character :");
        String letter = scanner.next().toUpperCase();
        String vowelLetter  = letter + " is Vowel";
        String consonantLetter = letter + " is Consonant";
        switch(letter) {
            case "A":
            case "E":
            case "O":
            case "I":
            case "U":
                System.out.println(vowelLetter);
                break;
            default:
                System.out.println(consonantLetter);
                break;
        }
    }
}
