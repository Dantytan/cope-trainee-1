package Singleton;

public class SingletonEj {
    private static SingletonEj instancia;
    private SingletonEj (){

    }

    public static SingletonEj getIsntancia(){
        if (instancia==null){
            instancia= new SingletonEj();
        }
        return instancia;
    }

}
