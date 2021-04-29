import java.awt.*;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of your circle");
        int radius = scanner.nextInt();
        boolean flag = true;
        while(flag) {
            System.out.println("Press 1 for perimeter and 2 for Area");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println("Perimeter of your circle is - " + 2 * Math.PI * radius);
                flag = false;
            } else if (num == 2) {
                flag = false;
                System.out.println("Area of your circle is - " + Math.PI * Math.pow(radius, 2));
            } else {
                System.out.println("You Entered the wrong number Please try again - ");
            }
        }
    }
}
