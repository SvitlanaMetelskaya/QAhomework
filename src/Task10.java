import java.util.Scanner;

public class Task10 {
    //Дано натуральное число.
    // Определить: 1.является ли оно четным;
    // 2.оканчивается ли оно цифрой 7
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        if ((n%2)!=0){
         System.out.println("Нечетное");
        }
        else {
            System.out.println("Четное");

        }
        if ((n%10)!=7&&(n%10)!=-7){
            System.out.println("Не заканчиватся 7");
        }
        else {
            System.out.println("Заканчивается 7");

        }
    }
}
