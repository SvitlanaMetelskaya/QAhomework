import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //Даны два числа.
        // Если квадратный корень из второго числа меньше первого числа, то увеличить второе число в пять раз.
        // выполняется ли неравенство a < b < c;
        // выполняется ли неравенство b > a > c.
        Scanner a = new Scanner(System.in);
        double one = a.nextDouble();
        double two = a.nextDouble();
        if (Math.sqrt(two)<one) {
            double c = two*5;
            System.out.println(two*5);
            if (one<two&&two<c){
                System.out.println("Выполняется неравенство a < b < c");
            }
            if (two>one&&one>c){
                System.out.println("Выполняется неравенство b > a > c");
            }
        }
        else {
            System.out.println("Корень второго, больше первого");

        }
    }
}
