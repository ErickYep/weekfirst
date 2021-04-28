package Day2;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        //generateing Random number from 0 to 15
        Random random = new Random();
        int randomNumber = random.nextInt(15);
        System.out.println(randomNumber);
    }
}
