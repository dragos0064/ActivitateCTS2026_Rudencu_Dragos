package cts.Rudencu.Dragos.g1096.main;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.DispozitivSmart;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipClimatizare;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipIluminat;
import cts.Rudencu.Dragos.g1096.factorymethod.factory.FactoryDipozitiveClimatizare;
import cts.Rudencu.Dragos.g1096.factorymethod.factory.FactoryDispozitiveIluminat;
import cts.Rudencu.Dragos.g1096.factorymethod.factory.FactoryDispozitiveSmart;
import cts.Rudencu.Dragos.g1096.prototype.PrototypeRutinaSmart;
import cts.Rudencu.Dragos.g1096.prototype.RutinaSmart;

public class Main {
    public static void main(String[] args) throws Exception{
        FactoryDispozitiveSmart fabricaIluminat = new FactoryDispozitiveIluminat();
        FactoryDispozitiveSmart fabricaClimatizare = new FactoryDipozitiveClimatizare();

        DispozitivSmart becDormitor = fabricaIluminat.creeazaDispozitiv(TipIluminat.BEC, "Dormitor");
        DispozitivSmart ledLiving = fabricaIluminat.creeazaDispozitiv(TipIluminat.BANDA_LED, "Living");

        DispozitivSmart termostatHol = fabricaClimatizare.creeazaDispozitiv(TipClimatizare.TERMOSTAT, "Hol principal");

        becDormitor.porneste();
        ledLiving.porneste();
        termostatHol.porneste();

        //prototype
        PrototypeRutinaSmart rutinaDormitor = new RutinaSmart("rutinaDormitor", "20:00",5,23);
        PrototypeRutinaSmart rutinaLiving = rutinaDormitor.clone();

        ((RutinaSmart)rutinaLiving).setNumeRutina("rutinaLiving");
        ((RutinaSmart)rutinaLiving).setOraPornire("07:00");

        System.out.println(rutinaDormitor);
        System.out.println(rutinaLiving);


    }
}
