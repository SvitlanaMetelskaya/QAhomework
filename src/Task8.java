import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sim = new Scanner(System.in);
        int rez = sim.nextInt();
        print(rez);
    }
    public static void print(int n){
        for (int s = 0; s < n; s++) {
            System.out.print("*");
        }
    }
}


