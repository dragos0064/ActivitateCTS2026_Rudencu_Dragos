package cts.Rudencu.Dragos.g1096.singleton.clase;

public class Internet implements RoboticArmConnection{
    private static Internet instance = null;

    private Internet(){

    }
    public static synchronized Internet getInstance(){
        if(instance == null){
            instance = new Internet();
        }
        return instance;
    }


    @Override
    public void afisareDetalii() {
        System.out.println("Conexiune la Internet");
    }
}
