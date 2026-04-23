package cts.Rudencu.Dragos.g1096.singleton.main;

import cts.Rudencu.Dragos.g1096.singleton.models.AMasina;
import cts.Rudencu.Dragos.g1096.singleton.models.IService;
import cts.Rudencu.Dragos.g1096.singleton.models.MasinaClient;
import cts.Rudencu.Dragos.g1096.singleton.models.ServiceAuto;

public class Main {
    public static void main(String[] args) {
        IService serviceReferenta1 = ServiceAuto.getInstance();
        AMasina masina1 = new MasinaClient("B-100-ABC");
        AMasina masina2= new MasinaClient("B-100-ABC");

        serviceReferenta1.preiaMasina(masina1);

        IService serviceReferinta2 = ServiceAuto.getInstance();

        serviceReferinta2.preiaMasina(masina2);
        serviceReferenta1.elibereazaService();
        serviceReferinta2.elibereazaService();
    }
}
