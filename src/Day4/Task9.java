package Day4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Determining Tandz) Year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year - ");
        int year = scanner.nextInt();
        if(year%4 == 0){
            year = year/4;
            if (year%100 !=25 && year%100 !=50 && year%100 !=75)
            {
                System.out.println("It's Tandz Year");
            }
        }
        else
            System.out.println("It isn.t Tandz Year");
    }
}
