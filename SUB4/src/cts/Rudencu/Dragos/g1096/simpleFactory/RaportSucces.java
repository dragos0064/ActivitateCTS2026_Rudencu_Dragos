package cts.Rudencu.Dragos.g1096.simpleFactory;

public class RaportSucces implements TestReport {
    private String mesaj;

    public RaportSucces(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mesaj: " + mesaj);
    }
}
