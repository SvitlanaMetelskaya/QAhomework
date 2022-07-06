import java.util.Scanner;

public class Task11  {
    //Известенвесбоксера-любителя.
    // Известно, чтовестаков, что боксер может быть отнесенкоднойизтрехвесовыхкатегорий:
    // 1.легкийвес — до 60 кг;
    // 2.среднийвес — до 75 кг;
    // 3.тяжелыйвес — до 91 кг;
    // 4.супертяжелыйвес – с 91 кг.
    // Определить, вкакойкатегориибудетвыступатьданныйбоксер.
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int v = a.nextInt();
        if (v<60) {
            System.out.println(" Легкий вес");
        }
        else {
        }
        if (v>=60 && v<75) {
            System.out.println(" Средний вес");
        }
        else {
        }
        if (v>=75 && v<91) {
            System.out.println(" Тяжелый вес");
        }
        else {
        }
        if (v>=91) {
            System.out.println(" Супертяжелый вес");
        }
        }
    }


