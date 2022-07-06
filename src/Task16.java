public class Task16 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        int sum = 0;
        int pr = 1;
        int sc = 0;
        int sum2 = 0;
        for (int i = 0; i<12; i++){
            mass[i] = i+1;
            System.out.print(mass[i]);
            sum += mass[i];
            pr *= mass[i];
            sc += mass[i]*mass[i];
            if (i<6){
                sum2 += mass[i];
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(pr);
        System.out.println(sc);
        System.out.println(sum2);
        for (int j = 0; j<12; j++){
            System.out.print(mass[11-j]);
        }
    }
}
