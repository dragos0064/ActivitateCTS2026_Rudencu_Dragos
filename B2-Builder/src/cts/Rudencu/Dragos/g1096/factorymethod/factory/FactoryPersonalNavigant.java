package cts.Rudencu.Dragos.g1096.factorymethod.factory;

import cts.Rudencu.Dragos.g1096.factorymethod.clase.*;

public class FactoryPersonalNavigant implements FactoryPersonalAbstract{
    @Override
    public AngajatAerian getAngajat(TipPersonal tip, String nume) {
        return switch (tip){
            case TipNaviganti.Pilot -> new Pilot(nume);
            case TipNaviganti.Copilot -> new Copilot(nume);
            default -> null;
        };
    }
}
