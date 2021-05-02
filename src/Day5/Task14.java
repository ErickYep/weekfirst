package Day5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //Determining Final score
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Quiz Score - ");
        int quiz = scanner.nextInt();
        System.out.print("Enter Mid-term - ");
        int midTerm = scanner.nextInt();
        System.out.print("Enter Final Score - ");
        int finall = scanner.nextInt();
        int average = ((quiz + midTerm + finall) / 3) / 10;
        if (quiz > 100 || midTerm > 100 || finall > 100)
            System.out.println("Wrong number/rs");
        else {
            switch (average) {
                case 4:
                case 5:
                    System.out.println("Your Grade is C");
                    break;
                case 6:
                case 7:
                    System.out.println("Your Grade is B");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("Your Grade is A");
                    break;
                default:
                    System.out.println("Your Grade is F");
            }
        }
    }
}
