package Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //generating random number without bounds
        Random random = new Random();
        int randomNumber = random.nextInt() % 6 + 2;
        System.out.println("Your random number is - " + randomNumber);
    }
}
