package Topic0;

public class test {
    public static void main(String[] args) {
        challenge a = new challenge();
        a.llenarMemoria();
        //a.mostrarMemoria();
        System.out.println("");
        System.out.println(a.procesoSistema());
        System.out.println(a.procesoAplicacion());
        a.guardarProcesoSistemaMemoria();
        System.out.println(a.procesoSistema());
        a.guardarProcesoAplicacionMemoria();
        a.guardarProcesoSistemaMemoria();
        a.guardarProcesoAplicacionMemoria();
        a.mostrarMemoria();
    }
}
