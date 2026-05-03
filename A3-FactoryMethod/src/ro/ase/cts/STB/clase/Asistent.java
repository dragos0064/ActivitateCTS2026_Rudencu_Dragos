package ro.ase.cts.STB.clase;

public class Asistent implements PersonalSpital{
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistent: " + this.nume);
    }
}
