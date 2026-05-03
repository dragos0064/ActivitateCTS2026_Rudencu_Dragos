package ro.ase.cts.STB.clase;

public class Medic implements PersonalSpital{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Medic: " +this.nume);
    }
}
