package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Converting Farenheit to Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Farenheit Degree - ");
        double farenheitDegree = scanner.nextInt();
        double celsiusDegree = (farenheitDegree - 32) * 5 / 9;
        System.out.print("Celsius degree is(double) - " + celsiusDegree + "\n");
        float celsiusDegree1 = (float) celsiusDegree;
        System.out.print("Celsius degree is(float) - " + celsiusDegree1 + "\n");
        int celsiusDegree2 = (int) celsiusDegree1;
        System.out.print("Celsius degree is(int) - " + celsiusDegree2 + "\n");

    }
}
