package ro.ase.fabrici;

import ro.ase.clase.Clatite;
import ro.ase.clase.FelDeMancare;
import ro.ase.clase.Papanasi;
import ro.ase.enums.TipDesert;
import ro.ase.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare{

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return creeareFelDeMancare(tip,gramaj,pret,500);
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return switch (tip){
            case TipDesert.Papanasi -> new Papanasi(nrCalorii,pret,gramaj);
            case TipDesert.Clatite -> new Clatite(nrCalorii,pret,gramaj);
            default -> null;
        };
    }
}
