import java.util.Scanner;

public class Task6 {
    public static void main(String args[]) {

        Scanner vasya = new Scanner(System.in);
        int ohko = vasya.nextInt();
        switch (ohko) {
            case (3):
                System.out.println("Выиграш");
                break;
            case (0):
                System.out.println("Проиграш");
                break;
            case (1):
                System.out.println("Ничья");
                break;
            default:
                System.out.println("Результат матча не известен");
                break;


        }

    }
}


