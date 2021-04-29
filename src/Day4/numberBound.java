package Day4;

import java.util.Scanner;

public class numberBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your number - ");
        int number = scanner.nextInt();
        if(number>10 && number < 100)
            System.out.println("From 10 to 100");
        else if(number>200 && number<300)
            System.out.println("From 200 to 300");
        else if(number>300 && number<500)
            System.out.println("From 300 to 500");
        else
            System.out.println("Out of Bounds");
    }
}
