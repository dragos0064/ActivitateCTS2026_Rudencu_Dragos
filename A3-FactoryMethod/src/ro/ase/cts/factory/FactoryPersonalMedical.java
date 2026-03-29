package ro.ase.cts.factory;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;

public class FactoryPersonalMedical implements FactoryPersonal{
    @Override
    public PersonalSpital getPersonal(TipPersonal tip, String nume) {
        return switch (tip){
            case MEDIC -> new Medic(nume);
            case ASISTENT -> new Asistent(nume);
            default -> null;
        };
    }
}
