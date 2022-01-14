package cope.practice1;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        //aplicacion que dice si un numero es par o impar
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.print("The number " + numero + " is"+ " ");
        if (numero % 2 != 0)
            System.out.println("odd number");
        else
            System.out.println("even number");
        System.out.println("bye!");
    }
}
