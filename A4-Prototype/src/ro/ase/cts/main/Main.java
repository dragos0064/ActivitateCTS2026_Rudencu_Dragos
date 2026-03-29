package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeReteta;
import ro.ase.cts.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        PrototypeReteta retetaOriginala = new Reteta("Retatrutida",500,10);
        PrototypeReteta clonaReteta = retetaOriginala.clone();

        ((Reteta)clonaReteta).setCantitateExcipient(15);
        ((Reteta)clonaReteta).setCantitateSolutieActiva(670);

        System.out.println("Reteta 1: " + retetaOriginala.toString());
        System.out.println("Reteta 2: " + clonaReteta.toString());
    }
}
