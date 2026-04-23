package cts.Rudencu.Dragos.g1096.factorymethod.factory;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.*;

public class FactoryPersonalCabina implements FactoryPersonalAbstract{
    @Override
    public AngajatAerian getAngajat(TipPersonal tip, String nume) {
        return switch (tip){
            case TipCabina.Sef_Cabina -> new SefCabina(nume);
            case TipCabina.Insotitor_Zbor -> new InsotitorZbor(nume);
            default -> null;
        };
    }
}
