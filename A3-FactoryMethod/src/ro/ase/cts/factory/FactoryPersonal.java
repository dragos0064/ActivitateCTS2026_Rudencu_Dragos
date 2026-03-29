package ro.ase.cts.factory;

import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.enums.TipPersonal;

public interface FactoryPersonal {
    PersonalSpital getPersonal(TipPersonal tip, String nume);
}
