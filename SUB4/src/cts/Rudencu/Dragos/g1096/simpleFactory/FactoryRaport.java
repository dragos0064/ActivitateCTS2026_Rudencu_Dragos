package cts.Rudencu.Dragos.g1096.simpleFactory;

public class FactoryRaport {

    public TestReport getRaport(TipRaport tip, String mesaj){
        return switch (tip){
            case SUCCESS -> new RaportSucces(mesaj);
            case WARNING -> new RaportAvertizare(mesaj);
            case ERROR -> new RaportEroare(mesaj);
            default -> null;
        };
    }

}
