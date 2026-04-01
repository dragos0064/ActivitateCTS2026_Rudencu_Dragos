package ro.ase.cts.clase;

public class Troleibuz implements MijlocTransport{
    private String numarInmatriculare;

    public Troleibuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Troleibuz: " + numarInmatriculare);
    }
}
