package cts.Rudencu.Dragos.g1096.singleton.clase;

public class Temperatura implements RoboticArmConnection{

    private static Temperatura instance = null;

    private Temperatura(){}

    public static synchronized Temperatura getInstance(){
        if(instance == null){
            instance = new Temperatura();
        }
        return instance;
    }


    @Override
    public void afisareDetalii() {
        System.out.println("Conexiunea la senzorul de temp.");
    }
}
