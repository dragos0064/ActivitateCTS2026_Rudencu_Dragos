package ro.ase.cts.adapter.clase.spital;

public class MedicamentAdaptor {
    //avem nevoie de obiectul pe care il adaptam:
    private Medicament medicamentMagazin;

    public MedicamentAdaptor(Medicament medicamentMagazin) {
        super(medicamentMagazin.getNumeMedicament());
        this.medicamentMagazin = medicamentMagazin;
    }

    @Override
    public void cumparaMedicament() {
        medicamentMagazin.achizitioneazaMedicament();
    }
}
