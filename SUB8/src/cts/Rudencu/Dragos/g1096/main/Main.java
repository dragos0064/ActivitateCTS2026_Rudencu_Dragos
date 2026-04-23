package cts.Rudencu.Dragos.g1096.main;

import cts.Rudencu.Dragos.g1096.prototype.BauturaPresetata;
import cts.Rudencu.Dragos.g1096.prototype.PrototypeBautura;
import cts.Rudencu.Dragos.g1096.simplefactory.clase.Bautura;
import cts.Rudencu.Dragos.g1096.simplefactory.clase.TipBautura;
import cts.Rudencu.Dragos.g1096.simplefactory.factory.FactoryBautura;

public class Main {
    public static void main(String[] args) {
        FactoryBautura factoryBautura = new FactoryBautura();
        Bautura cappucino = factoryBautura.creeareBautura(TipBautura.CAFEA, "Americano", 400, 17);
        Bautura ceaiMusetel = factoryBautura.creeareBautura(TipBautura.CEAI, "Ceai de Musetel", 500, 10);
        Bautura ceaiFructe = factoryBautura.creeareBautura(TipBautura.CEAI, "Ceai cu fructe de padure", 230, 15);
        Bautura ciocolataCalda = factoryBautura.creeareBautura(TipBautura.CIOCOLATA_CALDA, "Ciocolata calda cu bezele", 750, 40);


        cappucino.metodaPreparare();
        ceaiMusetel.metodaPreparare();
        ceaiFructe.metodaPreparare();
        ciocolataCalda.metodaPreparare();

        PrototypeBautura prototypeBautura = new BauturaPresetata("Cafea", 300, "Fara");
        PrototypeBautura bautura1 = prototypeBautura.clone();
        PrototypeBautura bautura2 = prototypeBautura.clone();

        ((BauturaPresetata)bautura1).setAroma("Caramel");
        ((BauturaPresetata)bautura1).setVolum(350);

        System.out.println(bautura1);
        System.out.println(bautura2);
    }
}
