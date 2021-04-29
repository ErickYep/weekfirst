package Day4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Deciding what number is it
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if(number == 0)
            System.out.println("zero");
        else if(Math.abs(number)<1)
            System.out.println("small");
        else if(number<0)
            System.out.println("Negative");

        else if(number>1000000)
            System.out.println("large");
        else
            System.out.println("positive");
    }
}
