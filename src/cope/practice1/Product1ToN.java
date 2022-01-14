package cope.practice1;

public class Product1ToN {
    public static void main(String[] args) {
        long producto = 1l;
        int numeroDesde = 1;
        int numeroHasta = 13;
        for (int i = numeroDesde; i <=numeroHasta; ++i){
            producto = producto * i;
        }
        System.out.println(producto);
    }
}
