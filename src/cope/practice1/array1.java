package cope.practice1;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cuantos numeros tendra la matriz");
        int NumeroLongitudMatriz = scanner.nextInt();
        int matriz[] = new int[NumeroLongitudMatriz];
        System.out.println("ingrese los numeros que guardara la matriz");
        for (int i = 0; i<NumeroLongitudMatriz;++i)
        {
            matriz[i]=scanner.nextInt();
        }
        for (int i = 0; i<NumeroLongitudMatriz;++i)
        {
            System.out.println(matriz[i]);
        }

    }
}
