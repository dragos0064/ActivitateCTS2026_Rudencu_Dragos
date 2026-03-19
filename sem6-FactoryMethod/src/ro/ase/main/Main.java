package ro.ase.main;

import ro.ase.clase.FelDeMancare;
import ro.ase.clase.Supa;
import ro.ase.enums.TipDesert;
import ro.ase.enums.TipSupa;
import ro.ase.fabrici.FabricaFelDeMancare;
import ro.ase.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
        FelDeMancare supaDeVita = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeVita, 200, 30);
        FelDeMancare supaDeLegume = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeLegume, 400,20);

        FelDeMancare desert = fabricaFelDeMancare.creeareFelDeMancare(TipDesert.Clatite, 100, 15.5);
        FelDeMancare papanasi = fabricaFelDeMancare.creeareFelDeMancare(TipDesert.Papanasi, 300, 21.2);

        supaDeLegume.afisareDescriere();
        supaDeVita.afisareDescriere();

        desert.afisareDescriere();
    }
}
