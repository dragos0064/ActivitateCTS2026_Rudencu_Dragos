package ro.ase.cts.adapter.clase.spital;

public class Medicament {
    private String numeMedicament;
    private float pretMedicament;

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("Medicamentul " + this.numeMedicament + " este achizitionat la pretul de "+ this.pretMedicament);
        }else{
            System.out.println("Medicamentul " + this.numeMedicament + " are nevoie de reteta");
        }
    };
    private Boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
    };

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }
}