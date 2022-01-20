package cope.practice1;

import java.util.Scanner;

public class printArrayInStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cuantos numeros tendra la matriz");
        final int NumeroLongitudMatriz = scanner.nextInt();
        final int matriz[] = new int[NumeroLongitudMatriz];
        System.out.println("ingrese los numeros que guardara la matriz");
        for (int i = 0; i<NumeroLongitudMatriz;++i)
        {
            matriz[i]=scanner.nextInt();
        }
        for (int i = 0; i<NumeroLongitudMatriz;++i)
        {
            System.out.print(matriz[i] + " : ");
            int cantidadestrellas = matriz[i];
            for (int b = 0; b<cantidadestrellas;++b){
                System.out.print("*");
            }
            System.out.println("(" + matriz[i] + ")");
        }
    }
}
