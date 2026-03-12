package simple.factory.main;

import simple.factory.stb.clase.MijlocTransport;
import simple.factory.stb.fabrica.Fabrica;
import simple.factory.stb.fabrica.Tip;

public class Main {

    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();
    }

    public static void main(String[] args) throws Exception {
        Fabrica factory = Fabrica.getInstance();

        MijlocTransport autobuz = factory.getMijlocTransport("Mercedez", 100, Tip.AUTOBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("Astra", 1, Tip.TRAMVAI);
        MijlocTransport troleibuz = factory.getMijlocTransport("Mercedez", 97, Tip.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);

    }
}
