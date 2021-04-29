package Day4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //generating odd and even values from bounds of a and b
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number - ");
        int b = scanner.nextInt();
        int c;
        if (a > b)
             c = b;
        else
            c = a;
        //12.1
        if (a > 0 && b > 0 && a > b) {
            if (a % 7 == 0 || b % 7 == 0) {
                for (int i = 0; i < a - b; i++) {
                    if (c % 2 == 1) {
                        System.out.println(c);
                    }
                    c += 1;
                }
            } else {
                for (int i = 0; i < Math.abs(a - b); i++) {
                    if (c % 2 == 0) {
                        System.out.println(c);
                    }
                    c += 1;
                }
            }
        } else
            for (int i = 0; i < Math.abs(a - b); i++) {
                if (c % 2 == 0) {
                    System.out.println(c);
                }
                c += 1;
            }

    }
}
