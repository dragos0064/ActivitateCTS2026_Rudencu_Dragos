package ro.ase.cts.factory;

import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.Registrator;
import ro.ase.cts.clase.Secretar;
import ro.ase.cts.enums.TipPersonal;

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
