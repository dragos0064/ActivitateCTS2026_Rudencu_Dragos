package cts.Rudencu.Dragos.g1096.factorymethod.factory;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.DispozitivSmart;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipDispozitiv;


public interface FactoryDispozitiveSmart {
    DispozitivSmart creeazaDispozitiv(TipDispozitiv tip, String camera) throws Exception;
}
