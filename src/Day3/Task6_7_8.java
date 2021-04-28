package Day3;

import java.sql.SQLOutput;

public class Task6_7_8 {
    public static void main(String[] args) {
        //String and char
        char E = 'E';
        char r = 'r';
        char i = 'i';
        char c = 'c';
        char k = 'k';
        String name = "" + E + r + i + c + k;
        System.out.println(name);
        int birthYear = 2000;
        System.out.println("  " + birthYear);
        int num = (int) E / 5;
        System.out.println("E = " + num);
        String nameValue = String.valueOf(E + r + i + c + k);
        System.out.println(name + "--" + nameValue);
    }
}
