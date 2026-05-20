package ro.ase.cts.main;

import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CardBancar;
import ro.ase.cts.clase.CardCalatorii;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Marcel");
        calator.plateste(10);

        calator.setModPlata(new CardBancar());
        calator.plateste(400);

        calator.setModPlata(new CardCalatorii());
        calator.plateste(30);
    }
}
