import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        // calculating squares
        System.out.println("if it right-angled triangle press 1\n"+"if it square press 2\n"+"if it rectangle press 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.print("Enter the first side of your right-angeled triangle");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second side of your right-angeled triangle");
                int num2 = scanner.nextInt();
                System.out.println("your triangle square is " + (num1*num2/2));
                break;
            case 2:
                System.out.print("Enter the side of your square - ");
                int num3 = scanner.nextInt();
                System.out.println("your square square is - " + num3*num3 );
                break;
            case 3:
                System.out.print("Enter the first side of your rectangle ");
                int num4 = scanner.nextInt();
                System.out.print("Enter the second side of your rectangle");
                int num5 = scanner.nextInt();
                System.out.println("your rectangle square is " + (num4*num5));
                break;

        }

    }
}
