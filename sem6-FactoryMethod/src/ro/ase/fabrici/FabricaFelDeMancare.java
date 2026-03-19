package ro.ase.fabrici;

import ro.ase.clase.FelDeMancare;
import ro.ase.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii);
}
