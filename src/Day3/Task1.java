package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Widening Primitive Conversion(implicit)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number from -128 to 127 - ");
        byte number = scanner.nextByte();
        short number1 = number;
        System.out.println("byte - " + number + "\nshort - " + number1 + "\n");
        int number2 = number1;
        System.out.println("short - " + number1 + "\nint - " + number2 + "\n");
        long number3 = number2;
        System.out.println("int - " + number2 + " \nlong - " + number3 + "\n");
        float number4 = number3;
        System.out.println("long - " + number3 + "\nfloat - " + number4 + "\n");
        double number5 = number4;
        System.out.println("float - " + number4 + "\ndouble - " + number5 + "\n");

    }
}
