package ro.ase.cts.clase;

public class Brancardier implements PersonalSpital{
    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardier: " + this.nume);
    }
}
