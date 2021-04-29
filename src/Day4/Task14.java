package Day4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //determining can we construct triaangle from this length
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first length - ");
        int length1 = scanner.nextInt();
        System.out.print("Enter the second length - ");
        int length2 = scanner.nextInt();
        System.out.print("Enter the third length - ");
        int length3 = scanner.nextInt();
        if(length1<length2+length3){
            if(length2<length1+length3){
                if(length3<length2+length1){
                    System.out.println("This can be a triangle");
                }
                else
                    System.out.println("This can't be a triangle");
            }else
                System.out.println("This can't be a triangle");
        }else
            System.out.println("This can't be a triangle");
    }
}
