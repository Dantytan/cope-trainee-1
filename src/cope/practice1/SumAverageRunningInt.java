package cope.practice1;

import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double promedio;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        final int desdenumero = scanner.nextInt();
        final int hastanumero = scanner.nextInt();
        for (int i = desdenumero; i <= hastanumero; ++i){
            sum += i;
            ++count;
        }
        promedio= sum % count;
        System.out.println(sum);
        System.out.println(promedio);
    }
}
