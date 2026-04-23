package ro.ase.cts.adapter.clase.main;

import ro.ase.cts.adapter.clase.spital.Medicament;
import ro.ase.cts.adapter.clase.spital.MedicamentAdaptor;

public class Main {

    //asta e o aplicatie (de aceea ne trebuie adapter):
    private static void procuraMedicamentFarmacie(Medicament medicamentFarmacie){

    }

    public static void main(String[] args) {
        Medicament medicamentFarmacie = new Medicament("Nurofen");
        Medicament medicamentMagazin = new Medicament("Paracetamol");

        medicamentMagazin.achizitioneazaMedicament();
        medicamentFarmacie.achizitioneazaMedicament();

        //acum le facem sa conlucreze:
        //*trebuie sa ne dam seama cine pe cine integreaza:
        //spitalul/magazinul se adapteaza la farmacie

        procuraMedicamentFarmacie(medicamentFarmacie);
        //procuraMedicamentFarmacie(medicamentMagazin);//nu merge, de aceea ne trebuie adapter (adaptam medicament magazin/spital la medicament farmacie)

        //facem adapter de obiecte (avem 2 clase concrete):

        MedicamentAdaptor medicamentAdaptat = new MedicamentAdaptor(medicamentMagazin);
       // procuraMedicamentFarmacie(medicamentAdaptat);



    }
}