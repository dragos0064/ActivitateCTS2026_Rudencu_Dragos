package cts.Rudencu.Dragos.g1096.singleton.clase;

public class Perimetral implements RoboticArmConnection{

    private static Perimetral instance = null;

    private Perimetral(){}

    public static synchronized Perimetral getInstance(){
        if(instance == null){
            instance = new Perimetral();
        }
        return instance;
    }


    @Override
    public void afisareDetalii() {
        System.out.println("Conexiunea la senz perimetral");
    }
}
