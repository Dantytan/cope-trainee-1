package Topic0;

public class challenge {
    String memoria [] = new String[200];
    int numero1;
    static int generador = 0;
    static int generador2 = 0;
    public void llenarMemoria() {
        for (int i = 0; i < 200; i++) {
            memoria[i]="**** ";
        }
    }
    public void mostrarMemoria(){
        for (int i = 0; i < 200; i++) {
            if(i % 10 == 0 ){
                System.out.print("\n");
            }
            System.out.print(memoria[i]);
        }
    }
    public int procesoSistema(){
        return numero1 = (int) (Math.random()*(10-5))+5;
    }
    public int procesoAplicacion(){
        return numero1 = (int) (Math.random()*(20-10))+10;
    }
    public void guardarProcesoSistemaMemoria(){
        generador++;
        int id = generador;
        int count = 0;
        for (int i = 199; i > 0 ; i-- ) {
          if (memoria[i]=="**** " && count < numero1){
              memoria[i]= "s00" + generador +" ";
              count++;
          }
        }

    }
    public void guardarProcesoAplicacionMemoria(){
        generador2++;
        int id= generador2;
        int count = 0;
        for (int i = 199; i > 0 ; i--) {
            if (memoria[i]=="**** " && count < numero1){
                memoria[i]= "a00" + generador2 + " ";
                count++;
            }
        }

    }
    public void eliminarProcesoSistema(int id){
        for (int i = 199; i > 0 ; i--) {
            if (memoria[i].equals("s00"+ id + " ")){
                memoria[i]="**** ";
            }

        }
    }
    public void eliminarProcesoAplicacion(int id){
        for (int i = 199; i > 0 ; i--) {
            if (memoria[i].equals("a00"+ id + " ")){
                memoria[i]="**** ";
            }
        }
    }
}