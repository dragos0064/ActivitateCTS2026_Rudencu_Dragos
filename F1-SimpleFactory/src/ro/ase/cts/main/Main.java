package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.TipTransport;

public class Main {
    public static void main(String[] args) throws Exception {
        Factory fabrica = new Factory();

        MijlocTransport vehicul1 = fabrica.getMijlocTransport(TipTransport.AUTOBUZ, "B 123 JUG");
        MijlocTransport vehicul2 = fabrica.getMijlocTransport(TipTransport.TROLEIBUZ, "CT 123 JUG");
        MijlocTransport vehicul3 = fabrica.getMijlocTransport(TipTransport.TROLEIBUZ, "VS 31 BAS");

        vehicul1.afiseazaDetalii();
        vehicul2.afiseazaDetalii();
        vehicul3.afiseazaDetalii();
    }
}
