package ro.ase.cts.STB.factory;

import ro.ase.cts.STB.clase.Brancardier;
import ro.ase.cts.STB.clase.PersonalSpital;
import ro.ase.cts.STB.clase.Registrator;
import ro.ase.cts.STB.clase.Secretar;
import ro.ase.cts.STB.enums.TipPersonal;

public class FactoryPersonalNonMedical implements FactoryPersonal{


    @Override
    public PersonalSpital getPersonal(TipPersonal tip, String nume) {
        return switch (tip){
            case BRANCARDIER -> new Brancardier(nume);
            case SECRETAR -> new Secretar(nume);
            case REGISTRATOR -> new Registrator(nume);
            default -> null;
        };
    }
}
