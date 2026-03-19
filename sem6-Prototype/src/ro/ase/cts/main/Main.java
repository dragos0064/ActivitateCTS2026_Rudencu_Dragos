package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare = new Rezervare("Mihai", 2, "22:00","0770878787");
        PrototypeRezervare rezervare2 = rezervare.copiaza();


        ((Rezervare)rezervare).setOraRezervare("18:00");
        ((Rezervare)rezervare).setNrPersoane(4);
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());

    }
}
