package ro.ase.cts.clase;

public class Tramvai implements MijlocTransport{

    private String numarInmatriculare;

    public Tramvai(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Tramvai: " + numarInmatriculare);
    }
}
