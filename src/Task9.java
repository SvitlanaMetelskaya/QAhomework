import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        //Известны площади круга  иквадрата.
        // Определить:
        // 1.уместится ли круг в к вадрате?
        // 2.уместится ли квадрат в круге?
        Scanner a = new Scanner(System.in);
        double s = a.nextInt();
        double k = a.nextInt();
        double d = 2*Math.sqrt(s/Math.PI);
        double c = Math.sqrt(k);
        if (d<c) {
            System.out.println("Круг уместиться в квадрат" + d);
        }
        else {
            System.out.println("Круг не вместиться в квадрат" + c);
        }
        if (d>c){
            System.out.println("Квадрат уместиться в круг" + d);
        }
        else {
            System.out.println("Квадрат не уместиться в круг");

        }
    }
}
