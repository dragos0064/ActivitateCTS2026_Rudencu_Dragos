package ro.ase.cts.spital.factory;

import ro.ase.cts.spital.clase.Asistent;
import ro.ase.cts.spital.clase.Brancardier;
import ro.ase.cts.spital.clase.Medic;
import ro.ase.cts.spital.clase.PersonalSpital;

public class FactoryPersonal {
    public PersonalSpital crearePersonal(TipPersonal tip,String nume){
        return switch (tip) {
            case MEDIC -> new Medic(nume);
            case ASISTENT -> new Asistent(nume);
            case BRANCARDIER -> new Brancardier(nume);
            default -> throw new IllegalArgumentException("Tipul de personal nu exista!");
        };

    }
}
