package cts.Rudencu.Dragos.g1096.main;

import cts.Rudencu.Dragos.g1096.prototype.clasa.BauturaPresetata;
import cts.Rudencu.Dragos.g1096.prototype.interfata.PrototypeBauturaPresetata;
import cts.Rudencu.Dragos.g1096.simplefactory.enums.TipBautura;
import cts.Rudencu.Dragos.g1096.simplefactory.factory.FactoryBautura;
import cts.Rudencu.Dragos.g1096.simplefactory.model.Bautura;

public class Main {
    public static void main(String[] args) {
        FactoryBautura fabrica = new FactoryBautura();

        Bautura machiatto = fabrica.creareBautura(TipBautura.CAFEA,"MACHIATTO",300,30);
        Bautura milceai = fabrica.creareBautura(TipBautura.CEAI,"ceai",400,20);
        Bautura milcioco = fabrica.creareBautura(TipBautura.CIOCOLATA_CALDA,"cioco",240,16);


        //prototype
        PrototypeBauturaPresetata bauturaPresetata1 = new BauturaPresetata("Mihai", 400,24, "Caramel");
        PrototypeBauturaPresetata bautura1 = bauturaPresetata1.clone();

        ((BauturaPresetata)bautura1).setAroma("caramel");
        ((BauturaPresetata)bautura1).setVolum(350);
        System.out.println(bautura1.toString());


    }
}
