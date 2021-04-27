import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        //returns summary of odd and even numbers with time what you will
        int oddSum = 1;
        int evenSum = 0;
        int sum1 = 2;
        int sum2 = 3;
        System.out.print("Enter Time number - ");
        Scanner scanner = new Scanner(System.in);
        int timeOfUsing = scanner.nextInt();
        for (int i = 0; i < timeOfUsing-1; i++) {
            oddSum+=sum2;
            evenSum+=sum1;
            sum1+=2;
            sum2+=2;
        }
        System.out.println("Odd Sum is - " + oddSum +  "\nEven Sum is - " + evenSum );
    }
}
