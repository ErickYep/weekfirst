import java.util.Scanner;

public class HeartBeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heartBeat = scanner.nextInt();
        if (heartBeat < 0) {
            System.out.println("Մի Բան հետդ էն չի");
        } else if (heartBeat == 0) {
            System.out.println("Մեռել ես Ցավդ տանեմ");
        } else if (heartBeat < 30) {
            System.out.println("Վերջին խոսքեր ունե՞ս");
        } else if (heartBeat < 50) {
            System.out.println("Ա դու կարողա՞ լավ չես");
        } else if (heartBeat < 70) {
            System.out.println("Մի էրկու բաժակ էլ կխմես");
        } else if (heartBeat < 98) {
            System.out.println("Բալես հել գնա դասի հերիքա սծիմուլյանտություն անես");
        } else {
            System.out.println("Իջի ստացածա");
        }
    }
}
