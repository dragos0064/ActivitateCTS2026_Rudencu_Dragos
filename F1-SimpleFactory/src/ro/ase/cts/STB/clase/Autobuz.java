package ro.ase.cts.STB.clase;

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
