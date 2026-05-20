package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz();
        autobuz.abonareCalator(new Calator("Ion"));
        autobuz.abonareCalator(new Calator("Marius"));
        autobuz.abonareCalator(new Calator("Alex"));

        autobuz.notifica();
    }
}
