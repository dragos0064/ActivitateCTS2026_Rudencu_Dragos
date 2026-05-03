package ro.ase.cts.STB.factory;

import ro.ase.cts.STB.clase.PersonalSpital;
import ro.ase.cts.STB.enums.TipPersonal;

public interface FactoryPersonal {
    PersonalSpital getPersonal(TipPersonal tip, String nume);
}
