package cope.practice1;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int numeroDesde = 1;
        int numeroHasta = 110;
        int numero = 0;
        for (int i = numeroDesde; i <= numeroHasta; ++i) {
            numero = i;
            if (numero % 3 == 0 && numero % 5 == 0)
                System.out.print(" CozaLoza ");
            else if (numero % 3 == 0)
                System.out.print(" coza ");
            else if(numero% 5 == 0)
                System.out.print(" Loza ");
            else if (numero % 7 ==0)
                System.out.print(" Woza ");
            else
                System.out.print(" "+numero+" ");

            }
        }
    }

