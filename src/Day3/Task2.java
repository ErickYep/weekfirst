package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Narrowing Primitive Conversion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        double number = scanner.nextDouble();
        float number1 = (float) number;
        System.out.println("Double - " + number + "\nFloat - " + number1 + "\n");
        long number2 = (long) number1;
        System.out.println("Float - " + number1 + "\nlong - " + number2 + "\n");
        int number3 = (int) number2;
        System.out.println("long - " + number2 + "\nInt - " + number3 + "\n");
        short number4 = (short) number3;
        System.out.println("Int - " + number3 + "\nShort - " + number4 + "\n");
        byte number5 = (byte) number4;
        System.out.println("Short - " + number4 + "\nByte - " + number5 + "\n");

    }
}
