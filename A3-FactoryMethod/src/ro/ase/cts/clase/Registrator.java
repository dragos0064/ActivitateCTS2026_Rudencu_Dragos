package ro.ase.cts.clase;

public class Registrator implements PersonalSpital{
    private String nume;

    public Registrator(String nume) {
        this.nume = nume;
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Registrator: " + this.nume);
    }
}
