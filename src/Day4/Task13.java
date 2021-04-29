package Day4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //coordinate plane whether 2 points are in the same quarter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the abscissa of first coordinate - ");
        int abscissa1 = scanner.nextInt();
        System.out.print("Enter the ordinate of first coordinate - ");
        int ordinate1 = scanner.nextInt();
        System.out.print("Enter the abscissa of second coordinate - ");
        int abscissa2 = scanner.nextInt();
        System.out.print("Enter the ordinate of second coordinate - ");
        int ordinate2 = scanner.nextInt();
        if((double)abscissa1/abscissa2>0 && (double)ordinate2/ordinate1>0){
            System.out.println("in the same quarter");
        }
        else
            System.out.println("Not in the same quarter");
    }
}
