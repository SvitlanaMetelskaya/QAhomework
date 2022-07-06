public class Task2 {
    public static void main(String[] args) {
        //Дано двузначноечисло 39.
        // Найти:
        // 1.числодесятков в нем;
        // 2.число единиц  внем;
        // 3.сумму его цифр;
        // 4.произведение его цифр.
        int number = 39;
        System.out.println(number/10 + " Число десятков");
        System.out.println(number%10 + " Число единиц");
        System.out.println(number/10+number%10 + " Сумма цифр");
        System.out.println((number/10)*(number%10) + (" Произведение"));
    }
}
