package ro.ase.cts.adapter.clase.farmacie;

public class Medicament {
    private String numeMedicament;
    public void cumparaMedicament(){
        System.out.println("Medicamentul " + this.numeMedicament + " este cumparat de la farmacie");
    }

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }
}