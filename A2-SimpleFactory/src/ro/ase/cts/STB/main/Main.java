package ro.ase.cts.STB.main;

import ro.ase.cts.STB.spital.clase.PersonalSpital;
import ro.ase.cts.STB.spital.factory.FactoryPersonal;
import ro.ase.cts.STB.spital.factory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();

        PersonalSpital medic = factoryPersonal.crearePersonal(TipPersonal.MEDIC, "Popescu");
        PersonalSpital asistent = factoryPersonal.crearePersonal(TipPersonal.ASISTENT, "Maria");
        PersonalSpital brancardier = factoryPersonal.crearePersonal(TipPersonal.BRANCARDIER, "Vlad");

        medic.descrieRol();
        asistent.descrieRol();
        brancardier.descrieRol();
    }
}
