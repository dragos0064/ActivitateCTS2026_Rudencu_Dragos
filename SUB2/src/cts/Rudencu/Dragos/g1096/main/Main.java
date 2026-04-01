package cts.Rudencu.Dragos.g1096.main;

import cts.Rudencu.Dragos.g1096.builder.RezervareBuilder;
import cts.Rudencu.Dragos.g1096.builder.RezervareCamera;
import cts.Rudencu.Dragos.g1096.singleton.ManagerHotel;

public class Main {
    public static void main(String[] args) {
        RezervareCamera rezervare1 = new RezervareBuilder("Ionescu Andrei",2).build();

        RezervareCamera rezervareCuFacilitati = new RezervareBuilder("Popescu Maria",3)
                .setMicDejunInclus(true)
                .setVedereLaMare(true)
                .build();

        RezervareCamera rezervareVIP = new RezervareBuilder("Vasilescu George", 7)
                .setMicDejunInclus(true)
                .setPatSuplimentar(false)
                .setTransferAeroport(true)
                .setVedereLaMare(true)
                .build();

        System.out.println("--- Rezultate Modul Rezervări Hotel ---");
        System.out.println(rezervare1);
        System.out.println(rezervareCuFacilitati);
        System.out.println(rezervareVIP);
        // singleton
        ManagerHotel managerReceptie = ManagerHotel.getInstance();
        System.out.println(managerReceptie.getNrTotalCamereDisponibile());
        managerReceptie.setNrTotalCamereDisponibile(99);
        ManagerHotel managerDirector = ManagerHotel.getInstance();
        System.out.println(managerDirector.getNrTotalCamereDisponibile());
        if (managerReceptie == managerDirector) {
            System.out.println("SUCCES: Ambele referințe indică spre același obiect Singleton!");
        } else {
            System.out.println("EROARE: Instanțele sunt diferite.");
        }

    }
}
