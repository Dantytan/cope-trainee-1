package Factory.Transporte;

public class Aplicacion {
    public static void main(String[] args) {
        Transporte t1 = Fabrica.construir("Motocicleta");
        t1.arrancar();
        t1.detener();
        System.out.println(t1.tipo());
    }
}
