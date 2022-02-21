package Topic0;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean start = true;
        challenge a = new challenge();
        Scanner scanner = new Scanner(System.in);
        a.llenarMemoria();
        do{
            System.out.println("Elija una opcion a relizar");
            System.out.println("1 : Crear proceso de Aplicacion");
            System.out.println("2 : Crear proceso de Sistema");
            System.out.println("3 : Eliminar proceso de Sistema");
            System.out.println("4 : Eliminar proceso de Aplicacion");
            System.out.println("5: salir");
            int eleccionProceso = scanner.nextInt();
            switch (eleccionProceso){
                case 1:
                    if(eleccionProceso==1)
                       a.procesoAplicacion();
                    a.guardarProcesoAplicacionMemoria();
                    a.mostrarMemoria();
                    break;
                case 2:
                    if(eleccionProceso==2)
                        a.procesoSistema();
                    a.guardarProcesoSistemaMemoria();
                    a.mostrarMemoria();
                    break;
                case 3:
                    if(eleccionProceso==3)
                        System.out.println("Digite el id a eliminar");
                        a.eliminarProcesoSistema(scanner.nextInt());
                    a.mostrarMemoria();
                    break;
                case 4:
                    if(eleccionProceso==4)
                        System.out.println("Digite el id a eliminar");
                    a.eliminarProcesoAplicacion(scanner.nextInt());
                    a.mostrarMemoria();
                    break;
                default:if(eleccionProceso==5)
                    start=false;

            }
            System.out.println(" ");
        }while (start==true);

    }
}
