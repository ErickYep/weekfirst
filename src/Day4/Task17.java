package Day4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //ordering 3 numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number - ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number - ");
        int c = scanner.nextInt();
        if(a<=b){
            if(b<=c)
            {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if(a<=c) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else{
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        else if(a<=c){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if(b<=c) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else{
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }

    }
}
