package ro.ase.fabrici;

import ro.ase.clase.FelDeMancare;
import ro.ase.clase.SupaDeLegume;
import ro.ase.clase.SupaDeVita;
import ro.ase.enums.TipFelDeMancare;
import ro.ase.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return switch (tip){
            case TipSupa.SupaDeLegume -> new SupaDeLegume(gramaj,pret);
            case TipSupa.SupaDeVita -> new SupaDeVita(gramaj,pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return creeareFelDeMancare(tip,gramaj,pret);
    }
}
