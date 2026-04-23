package cts.Rudencu.Dragos.g1096.builder.main;

import cts.Rudencu.Dragos.g1096.builder.clase.Rezervare;
import cts.Rudencu.Dragos.g1096.factorymethod.clase.AngajatAerian;
import cts.Rudencu.Dragos.g1096.factorymethod.clase.TipCabina;
import cts.Rudencu.Dragos.g1096.factorymethod.clase.TipNaviganti;
import cts.Rudencu.Dragos.g1096.factorymethod.factory.FactoryPersonalAbstract;
import cts.Rudencu.Dragos.g1096.factorymethod.factory.FactoryPersonalCabina;
import cts.Rudencu.Dragos.g1096.factorymethod.factory.FactoryPersonalNavigant;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare.RezervareBuilder(10, 2).build();
        Rezervare rezervare2 = new Rezervare.RezervareBuilder(7,4)
                .setAsezareGeam(true).setIdGenMuzica(2).build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);


        FactoryPersonalAbstract fabricaCabina = new FactoryPersonalCabina();
        FactoryPersonalAbstract fabricaNaviganti = new FactoryPersonalNavigant();

        AngajatAerian insotitor1 = fabricaCabina.getAngajat(TipCabina.Insotitor_Zbor, "Mihai Steward");
        AngajatAerian pilot1 = fabricaNaviganti.getAngajat(TipNaviganti.Pilot, "Vincentiu");

        insotitor1.raporteazaLaMunca();
        pilot1.raporteazaLaMunca();



    }
}
