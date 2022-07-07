import java.util.Random;

public class Task17 {
    public static void main(String[] args) {
        //Дан массив.
        // Вывести на экран сначала его неотрицательные элементы,
        // затем отрицательные
        Random r = new Random();
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = r.nextInt();
            if (mass[i] > 0) {
                System.out.println(mass[i]);
            }
        }
        for (int i = 0; i < 20; i++) {
            if (mass[i] < 0) {
                System.out.println(mass[i]);

    }}}}

