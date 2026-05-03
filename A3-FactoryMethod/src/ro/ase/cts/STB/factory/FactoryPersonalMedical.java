package ro.ase.cts.STB.factory;

import ro.ase.cts.STB.clase.Asistent;
import ro.ase.cts.STB.clase.Medic;
import ro.ase.cts.STB.clase.PersonalSpital;
import ro.ase.cts.STB.enums.TipPersonal;

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
