import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Даны радиус круга и сторона квадрата.
        // У какой фигуры площадь больше?
        Scanner a = new Scanner(System.in);
        double r = a.nextDouble();
        double s = a.nextDouble();
        double plk = Math.PI*Math.pow(r,2);
        double pls = Math.pow(s,2);
        if (plk>pls) {
            System.out.println("Площадь круга больше площади квадрата");
        }
        else if (plk<pls){
            System.out.println("Площадь квадрата больше площади круга");
        }
        else {
            System.out.println("Площади равны");
        }


    }
}
