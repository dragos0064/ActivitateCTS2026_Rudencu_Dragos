package cts.Rudencu.Dragos.g1096.factorymethod.factory;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.*;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipClimatizare;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipDispozitiv;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipIluminat;


public class FactoryDipozitiveClimatizare implements FactoryDispozitiveSmart{

    @Override
    public DispozitivSmart creeazaDispozitiv(TipDispozitiv tip, String camera) throws Exception {
        return switch (tip){
            case TipClimatizare.AER_CONDITIONAT -> new AerConditionatSmart("Baie");
            case TipClimatizare.TERMOSTAT -> new TermostatSmart("Hol");
            default -> null;
        };
    }

}
