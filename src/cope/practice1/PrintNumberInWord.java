package cope.practice1;

import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args) {
        //aplicacion que escribe en texto los numeros del 1 al 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero del 1 al 10 ");
        int NumberWord = scanner.nextInt();

        switch (NumberWord){
            case 1:
            if (NumberWord == 1)
                System.out.println("uno");
            break;
            case 2:
                if (NumberWord == 2)
                    System.out.println("dos");
                break;
            case 3:
                if (NumberWord == 3)
                    System.out.println("tres");
                break;
            case 4:
                if (NumberWord == 4)
                    System.out.println("cuatro");
                break;
            case 5:
                if (NumberWord == 5)
                    System.out.println("cinco");
                break;
            case 6:
                if (NumberWord == 6)
                    System.out.println("seis");
                break;
            case 7:
                if (NumberWord == 7)
                    System.out.println("siete");
                break;
            case 8:
                if (NumberWord == 8)
                    System.out.println("ocho");
                break;
            case 9:
                if (NumberWord == 9)
                    System.out.println("nueve");
                break;
            case 10:
                if (NumberWord == 10)
                    System.out.println("diez");
                break;
            default:
                System.out.println("el numero no esta entre 1 y 10");
        }

    }
}
