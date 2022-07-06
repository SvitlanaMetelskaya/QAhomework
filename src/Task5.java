import java.util.Scanner;

public class Task5
{
    public static void main (String args[])

        {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            System.out.println("deciatki "+(a/10));
            System.out.println("edinizi "+(a%10));
            System.out.println("sum " + ((a/100)+(a%100/10)+a%10));
            System.out.println("proiz " + ((a/100)*(a%100/10)*(a%10)));




    }
}
