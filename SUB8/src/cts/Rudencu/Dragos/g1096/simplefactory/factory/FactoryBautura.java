package cts.Rudencu.Dragos.g1096.simplefactory.factory;

import cts.Rudencu.Dragos.g1096.simplefactory.clase.*;

public class FactoryBautura {
    public Bautura creeareBautura(TipBautura tip, String nume, double volum, double pret){
        return switch (tip){
            case CAFEA -> new Cafea(nume,volum,pret);
            case CEAI -> new Ceai(nume,volum,pret);
            case CIOCOLATA_CALDA -> new Ciocolata_Calda(nume,volum,pret);
            default -> null;
        };
    }
}
