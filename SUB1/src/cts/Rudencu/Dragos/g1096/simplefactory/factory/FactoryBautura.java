package cts.Rudencu.Dragos.g1096.simplefactory.factory;

import cts.Rudencu.Dragos.g1096.simplefactory.enums.TipBautura;
import cts.Rudencu.Dragos.g1096.simplefactory.model.Bautura;
import cts.Rudencu.Dragos.g1096.simplefactory.model.Cafea;
import cts.Rudencu.Dragos.g1096.simplefactory.model.Ceai;
import cts.Rudencu.Dragos.g1096.simplefactory.model.CiocolataCalda;

public class FactoryBautura {
    public Bautura creareBautura(TipBautura tip, String nume, float volum, float pret){
        return switch (tip){
            case CEAI ->new Ceai(nume, volum,pret);
            case CAFEA -> new Cafea(nume,volum,pret);
            case CIOCOLATA_CALDA -> new CiocolataCalda(nume,volum,pret);
        };
    }
}
