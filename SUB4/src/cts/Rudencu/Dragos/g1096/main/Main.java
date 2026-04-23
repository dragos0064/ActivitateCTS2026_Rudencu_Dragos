package cts.Rudencu.Dragos.g1096.main;

import cts.Rudencu.Dragos.g1096.simpleFactory.FactoryRaport;
import cts.Rudencu.Dragos.g1096.simpleFactory.RaportSucces;
import cts.Rudencu.Dragos.g1096.simpleFactory.TestReport;
import cts.Rudencu.Dragos.g1096.simpleFactory.TipRaport;
import cts.Rudencu.Dragos.g1096.singleton.clase.Internet;
import cts.Rudencu.Dragos.g1096.singleton.clase.Perimetral;
import cts.Rudencu.Dragos.g1096.singleton.clase.RoboticArmConnection;
import cts.Rudencu.Dragos.g1096.singleton.clase.Temperatura;

public class Main {
    public static void main(String[] args) {
        Internet instantaInternet = Internet.getInstance();
        Internet instantaInternet1 = Internet.getInstance();
        Perimetral instantaPerimetru = Perimetral.getInstance();
        Temperatura instantaTemperatura = Temperatura.getInstance();

        instantaInternet.afisareDetalii();
        instantaPerimetru.afisareDetalii();
        instantaTemperatura.afisareDetalii();

        if(instantaInternet.equals(instantaInternet1)){
            System.out.println("egale");
        }else{
            System.out.println("eroare");
        }

        //simple fact

        FactoryRaport factoryRaport = new FactoryRaport();

        TestReport raportSucces = factoryRaport.getRaport(TipRaport.SUCCESS,"warning!");
        TestReport raportWarning = factoryRaport.getRaport(TipRaport.WARNING, "atentie");
        TestReport raportEroare = factoryRaport.getRaport(TipRaport.ERROR, "eroare");


        raportSucces.afisareDetalii();
        raportWarning.afisareDetalii();
        raportEroare.afisareDetalii();
    }
}
