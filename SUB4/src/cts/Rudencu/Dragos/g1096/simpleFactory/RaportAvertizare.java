package cts.Rudencu.Dragos.g1096.simpleFactory;

public class RaportAvertizare implements TestReport{
    private String mesaj;

    public RaportAvertizare(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mesaj: " + mesaj);
    }
}
