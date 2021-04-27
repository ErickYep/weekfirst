import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        //generateing Random number from 15 to 30
        Random random = new Random();
        int randomNumber = random.nextInt(15) + 15;
        System.out.println(randomNumber);

    }
}
