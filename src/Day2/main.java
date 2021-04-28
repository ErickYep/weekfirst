package Day2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //minutes for hours
        int minutes;
        double hours;
        int minuteLast;
        System.out.println("Enter minutes - ");
        Scanner scanner = new Scanner(System.in);
        minutes = scanner.nextInt();
        hours = minutes / 60 ;
        minuteLast = minutes% 60;
        System.out.println(minutes + " = " + hours + "hour and " + minuteLast +"minutes");
    }
}
