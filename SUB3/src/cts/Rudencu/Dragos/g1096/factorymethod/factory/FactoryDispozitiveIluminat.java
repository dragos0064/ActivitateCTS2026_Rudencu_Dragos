package cts.Rudencu.Dragos.g1096.factorymethod.factory;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.BandaLedSmart;
import cts.Rudencu.Dragos.g1096.factorymethod.clase.BecSmart;
import cts.Rudencu.Dragos.g1096.factorymethod.clase.DispozitivSmart;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipDispozitiv;
import cts.Rudencu.Dragos.g1096.factorymethod.enums.TipIluminat;

public class FactoryDispozitiveIluminat implements FactoryDispozitiveSmart{


    @Override
    public DispozitivSmart creeazaDispozitiv(TipDispozitiv tip, String camera) throws Exception {
        return switch (tip){
            case TipIluminat.BEC -> new BecSmart("Living");
            case TipIluminat.BANDA_LED -> new BandaLedSmart("Dormitor");
            default -> null;
        };
    }
}
