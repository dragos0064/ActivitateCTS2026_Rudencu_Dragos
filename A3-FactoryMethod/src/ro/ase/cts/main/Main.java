package ro.ase.cts.main;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;
import ro.ase.cts.factory.FactoryPersonal;
import ro.ase.cts.factory.FactoryPersonalMedical;
import ro.ase.cts.factory.FactoryPersonalNonMedical;

public class Main {
    public static void main(String[] args) {

        FactoryPersonal fabricaMedicala = new FactoryPersonalMedical();
        PersonalSpital medic1 = fabricaMedicala.getPersonal(TipPersonal.MEDIC, "Mihai Ion");
        PersonalSpital asistent = fabricaMedicala.getPersonal(TipPersonal.ASISTENT,"Ana");

        medic1.afiseazaDetalii();
        asistent.afiseazaDetalii();
        System.out.println("------------------");


        FactoryPersonal fabricaNonMedicala = new FactoryPersonalNonMedical();
        PersonalSpital brancardier = fabricaNonMedicala.getPersonal(TipPersonal.BRANCARDIER, "Darius");
        PersonalSpital secretara = fabricaNonMedicala.getPersonal(TipPersonal.SECRETAR, "Sara");
        PersonalSpital registrator = fabricaNonMedicala.getPersonal(TipPersonal.REGISTRATOR, "Alex");

        brancardier.afiseazaDetalii();
        secretara.afiseazaDetalii();
        registrator.afiseazaDetalii();
    }
}
