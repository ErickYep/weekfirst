package Day4;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        //Deciding is the number in bound and is it multiple of 3 or 5
        Random random = new Random();
        int number = random.nextInt();
        boolean answer = false;
        if (number > -1000 && number < 1000)
            answer = true;
        else if (number % 3 == 0 || number % 5 == 0)
            answer = true;
        System.out.println(answer);
    }
}
