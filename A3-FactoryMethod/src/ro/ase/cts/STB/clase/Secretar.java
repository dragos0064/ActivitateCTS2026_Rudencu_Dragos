package ro.ase.cts.STB.clase;

public class Secretar implements PersonalSpital{
    private String nume;

    public Secretar(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Secretar: " + this.nume);
    }
}
