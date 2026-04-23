package cts.Rudencu.Dragos.g1096.factorymethod.factory;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.AngajatAerian;
import cts.Rudencu.Dragos.g1096.factorymethod.clase.TipPersonal;

public interface FactoryPersonalAbstract {
    AngajatAerian getAngajat(TipPersonal tip,String nume );
}
