package Day3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Circle Perimeter and area
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of your Circle - ");
        double radius = scanner.nextDouble();
        double Pi = 3.141159;
        double perimeter = 2 * Pi * radius;
        double area = Pi * Math.pow(radius, 2);
        System.out.println("Parimeter is - " + perimeter + "\nArea is - " + area);
    }
}
