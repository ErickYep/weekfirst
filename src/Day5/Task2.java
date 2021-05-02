package Day5;

public class Task2 {
    public static void main(String[] args) {
        //Initializing Strings - literal and with new keyword
        String text1 = "Happy New Year";
        String text2 = new String();
        text2 = "Merry Christmas";
        String answer = (text1 == text2) ? "Texts are same" : "Texts aren't same";
        System.out.println(answer);
        String answer1 = (text1.equals(text2)) ? "Texts are same" : "Texts aren't same";
        System.out.println(answer1);
    }
}
