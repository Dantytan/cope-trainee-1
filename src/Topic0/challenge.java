package Topic0;

public class challenge {
    String memoria [] = new String[200];
    int numero1;
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
        int count = 0;
        for (int i = 0; i < 200 ; i++) {
          if (memoria[i]=="**** " && count < numero1){
              memoria[i]= "s001 ";
              count++;
          }
        }
    }
    public void guardarProcesoAplicacionMemoria(){
        int count = 0;
        for (int i = 0; i < 200 ; i++) {
            if (memoria[i]=="**** " && count < numero1){
                memoria[i]= "a001 ";
                count++;
            }
        }
    }

}