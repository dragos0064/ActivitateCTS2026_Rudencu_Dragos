package ro.ase.cts.clase;

public class Autobuz implements MijlocTransport{
    private String numarInmatriculare;

    public Autobuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Autobuz: " + numarInmatriculare);
    }
}
